/*
 * Generated by Robotoworks Mechanoid
 */
package com.robotoworks.example.recipes.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;

import com.robotoworks.example.recipes.content.RecipesDBContract.Ingredients;
import com.robotoworks.example.recipes.content.RecipesDBContract.Ingredients.Builder;
import com.robotoworks.mechanoid.util.Closeables;
import com.robotoworks.mechanoid.db.ActiveRecord;
import com.robotoworks.mechanoid.db.ActiveRecordFactory;
import com.robotoworks.mechanoid.Mechanoid;
import com.robotoworks.mechanoid.db.AbstractValuesBuilder;

public class IngredientsRecord extends ActiveRecord implements Parcelable {

	private static ActiveRecordFactory<IngredientsRecord> sFactory = new ActiveRecordFactory<IngredientsRecord>() {
		@Override
		public IngredientsRecord create(Cursor c) {
			return fromCursor(c);
		}
		
		@Override
		public String[] getProjection() {
			return PROJECTION;
		}
	};
	
	public static ActiveRecordFactory<IngredientsRecord> getFactory() {
		return sFactory;
	}

    public static final Parcelable.Creator<IngredientsRecord> CREATOR 
    	= new Parcelable.Creator<IngredientsRecord>() {
        public IngredientsRecord createFromParcel(Parcel in) {
            return new IngredientsRecord(in);
        }

        public IngredientsRecord[] newArray(int size) {
            return new IngredientsRecord[size];
        }
    };
    
    public static String[] PROJECTION = {
    	Ingredients._ID,
    	Ingredients.RECIPE_ID,
    	Ingredients.QUANTITY,
    	Ingredients.INGREDIENT
    };
    
    public interface Indices {
    	int _ID = 0;
    	int RECIPE_ID = 1;
    	int QUANTITY = 2;
    	int INGREDIENT = 3;
    }
    
    private long mRecipeId;
    private boolean mRecipeIdDirty;
    private String mQuantity;
    private boolean mQuantityDirty;
    private String mIngredient;
    private boolean mIngredientDirty;
    
    @Override
    protected String[] _getProjection() {
    	return PROJECTION;
    }
    
    public void setRecipeId(long recipeId) {
    	mRecipeId = recipeId;
    	mRecipeIdDirty = true;
    }
    
    public long getRecipeId() {
    	return mRecipeId;
    }
    
    public void setQuantity(String quantity) {
    	mQuantity = quantity;
    	mQuantityDirty = true;
    }
    
    public String getQuantity() {
    	return mQuantity;
    }
    
    public void setIngredient(String ingredient) {
    	mIngredient = ingredient;
    	mIngredientDirty = true;
    }
    
    public String getIngredient() {
    	return mIngredient;
    }
    
    
    public IngredientsRecord() {
    	super(Ingredients.CONTENT_URI);
	}
	
	private IngredientsRecord(Parcel in) {
    	super(Ingredients.CONTENT_URI);
    	
		setId(in.readLong());
		
		mRecipeId = in.readLong();
		mQuantity = in.readString();
		mIngredient = in.readString();
		
		boolean[] dirtyFlags = new boolean[3];
		in.readBooleanArray(dirtyFlags);
		mRecipeIdDirty = dirtyFlags[0];
		mQuantityDirty = dirtyFlags[1];
		mIngredientDirty = dirtyFlags[2];
	}
	
	@Override
	public int describeContents() {
	    return 0;
	}
	
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeLong(getId());
		dest.writeLong(mRecipeId);
		dest.writeString(mQuantity);
		dest.writeString(mIngredient);
		dest.writeBooleanArray(new boolean[] {
			mRecipeIdDirty,
			mQuantityDirty,
			mIngredientDirty
		});
	}
	
	@Override
	protected AbstractValuesBuilder createBuilder() {
		Builder builder = Ingredients.newBuilder();

		if(mRecipeIdDirty) {
			builder.setRecipeId(mRecipeId);
		}
		if(mQuantityDirty) {
			builder.setQuantity(mQuantity);
		}
		if(mIngredientDirty) {
			builder.setIngredient(mIngredient);
		}
		
		return builder;
	}
	
    @Override
	public void makeDirty(boolean dirty){
		mRecipeIdDirty = dirty;
		mQuantityDirty = dirty;
		mIngredientDirty = dirty;
	}

	@Override
	protected void setPropertiesFromCursor(Cursor c) {
		setId(c.getLong(Indices._ID));
		setRecipeId(c.getLong(Indices.RECIPE_ID));
		setQuantity(c.getString(Indices.QUANTITY));
		setIngredient(c.getString(Indices.INGREDIENT));
	}
	
	public static IngredientsRecord fromCursor(Cursor c) {
	    IngredientsRecord item = new IngredientsRecord();
	    
		item.setPropertiesFromCursor(c);
		
		item.makeDirty(false);
		
	    return item;
	}
	
	public static IngredientsRecord get(long id) {
	    Cursor c = null;
	    
	    ContentResolver resolver = Mechanoid.getContentResolver();
	    
	    try {
	        c = resolver.query(Ingredients.CONTENT_URI.buildUpon()
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
