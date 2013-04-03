/*
 * Generated by Robotoworks Mechanoid
 */
package com.robotoworks.example.recipes.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;

import com.robotoworks.example.recipes.content.RecipesDBContract.Recipes;
import com.robotoworks.example.recipes.content.RecipesDBContract.Recipes.Builder;
import com.robotoworks.mechanoid.util.Closeables;
import com.robotoworks.mechanoid.db.ActiveRecord;
import com.robotoworks.mechanoid.db.ActiveRecordFactory;
import com.robotoworks.mechanoid.Mechanoid;
import com.robotoworks.mechanoid.db.AbstractValuesBuilder;

public class RecipesRecord extends ActiveRecord implements Parcelable {

	private static ActiveRecordFactory<RecipesRecord> sFactory = new ActiveRecordFactory<RecipesRecord>() {
		@Override
		public RecipesRecord create(Cursor c) {
			return fromCursor(c);
		}
		
		@Override
		public String[] getProjection() {
			return PROJECTION;
		}
	};
	
	public static ActiveRecordFactory<RecipesRecord> getFactory() {
		return sFactory;
	}

    public static final Parcelable.Creator<RecipesRecord> CREATOR 
    	= new Parcelable.Creator<RecipesRecord>() {
        public RecipesRecord createFromParcel(Parcel in) {
            return new RecipesRecord(in);
        }

        public RecipesRecord[] newArray(int size) {
            return new RecipesRecord[size];
        }
    };
    
    public static String[] PROJECTION = {
    	Recipes._ID,
    	Recipes.TITLE,
    	Recipes.DESCRIPTION,
    	Recipes.AUTHOR_ID
    };
    
    public interface Indices {
    	int _ID = 0;
    	int TITLE = 1;
    	int DESCRIPTION = 2;
    	int AUTHOR_ID = 3;
    }
    
    private String mTitle;
    private boolean mTitleDirty;
    private String mDescription;
    private boolean mDescriptionDirty;
    private long mAuthorId;
    private boolean mAuthorIdDirty;
    
    @Override
    protected String[] _getProjection() {
    	return PROJECTION;
    }
    
    public void setTitle(String title) {
    	mTitle = title;
    	mTitleDirty = true;
    }
    
    public String getTitle() {
    	return mTitle;
    }
    
    public void setDescription(String description) {
    	mDescription = description;
    	mDescriptionDirty = true;
    }
    
    public String getDescription() {
    	return mDescription;
    }
    
    public void setAuthorId(long authorId) {
    	mAuthorId = authorId;
    	mAuthorIdDirty = true;
    }
    
    public long getAuthorId() {
    	return mAuthorId;
    }
    
    
    public RecipesRecord() {
    	super(Recipes.CONTENT_URI);
	}
	
	private RecipesRecord(Parcel in) {
    	super(Recipes.CONTENT_URI);
    	
		setId(in.readLong());
		
		mTitle = in.readString();
		mDescription = in.readString();
		mAuthorId = in.readLong();
		
		boolean[] dirtyFlags = new boolean[3];
		in.readBooleanArray(dirtyFlags);
		mTitleDirty = dirtyFlags[0];
		mDescriptionDirty = dirtyFlags[1];
		mAuthorIdDirty = dirtyFlags[2];
	}
	
	@Override
	public int describeContents() {
	    return 0;
	}
	
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeLong(getId());
		dest.writeString(mTitle);
		dest.writeString(mDescription);
		dest.writeLong(mAuthorId);
		dest.writeBooleanArray(new boolean[] {
			mTitleDirty,
			mDescriptionDirty,
			mAuthorIdDirty
		});
	}
	
	@Override
	protected AbstractValuesBuilder createBuilder() {
		Builder builder = Recipes.newBuilder();

		if(mTitleDirty) {
			builder.setTitle(mTitle);
		}
		if(mDescriptionDirty) {
			builder.setDescription(mDescription);
		}
		if(mAuthorIdDirty) {
			builder.setAuthorId(mAuthorId);
		}
		
		return builder;
	}
	
    @Override
	public void makeDirty(boolean dirty){
		mTitleDirty = dirty;
		mDescriptionDirty = dirty;
		mAuthorIdDirty = dirty;
	}

	@Override
	protected void setPropertiesFromCursor(Cursor c) {
		setId(c.getLong(Indices._ID));
		setTitle(c.getString(Indices.TITLE));
		setDescription(c.getString(Indices.DESCRIPTION));
		setAuthorId(c.getLong(Indices.AUTHOR_ID));
	}
	
	public static RecipesRecord fromCursor(Cursor c) {
	    RecipesRecord item = new RecipesRecord();
	    
		item.setPropertiesFromCursor(c);
		
		item.makeDirty(false);
		
	    return item;
	}
	
	public static RecipesRecord get(long id) {
	    Cursor c = null;
	    
	    ContentResolver resolver = Mechanoid.getContentResolver();
	    
	    try {
	        c = resolver.query(Recipes.CONTENT_URI.buildUpon()
			.appendPath(String.valueOf(id)).build(), PROJECTION, null, null, null);
	        
	        if(!c.moveToFirst()) {
	            return null;
	        }
	        
	        return fromCursor(c);
	    } finally {
	        Closeables.closeSilently(c);
	    }
	}
}
