/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqliteModelFactoryImpl extends EFactoryImpl implements SqliteModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SqliteModelFactory init()
  {
    try
    {
      SqliteModelFactory theSqliteModelFactory = (SqliteModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.robotoworks.com/mechanoid/sqlite/SqliteModel"); 
      if (theSqliteModelFactory != null)
      {
        return theSqliteModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SqliteModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqliteModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SqliteModelPackage.MODEL: return createModel();
      case SqliteModelPackage.DATABASE_BLOCK: return createDatabaseBlock();
      case SqliteModelPackage.MIGRATION_BLOCK: return createMigrationBlock();
      case SqliteModelPackage.EXPRESSION: return createExpression();
      case SqliteModelPackage.STATMENT: return createStatment();
      case SqliteModelPackage.TABLE_DECL: return createTableDecl();
      case SqliteModelPackage.ALTER_TABLE_CLAUSE: return createAlterTableClause();
      case SqliteModelPackage.COLUMN_DEF: return createColumnDef();
      case SqliteModelPackage.COLUMN_CONSTRAINT: return createColumnConstraint();
      case SqliteModelPackage.DEFAULT_VALUE: return createDefaultValue();
      case SqliteModelPackage.TABLE_CONSTRAINT: return createTableConstraint();
      case SqliteModelPackage.UNIQUE_TABLE_CONTRAINT: return createUniqueTableContraint();
      case SqliteModelPackage.INDEXED_COLUMN: return createIndexedColumn();
      case SqliteModelPackage.SELECT_STATEMENT: return createSelectStatement();
      case SqliteModelPackage.SELECT_CORE: return createSelectCore();
      case SqliteModelPackage.JOIN_SOURCE: return createJoinSource();
      case SqliteModelPackage.SINGLE_SOURCE: return createSingleSource();
      case SqliteModelPackage.JOIN_STATEMENT: return createJoinStatement();
      case SqliteModelPackage.RESULT_COLUMN: return createResultColumn();
      case SqliteModelPackage.CONFLICT_CLAUSE: return createConflictClause();
      case SqliteModelPackage.LITERAL_VALUE: return createLiteralValue();
      case SqliteModelPackage.OR_EXPR: return createOrExpr();
      case SqliteModelPackage.AND_EXPR: return createAndExpr();
      case SqliteModelPackage.PRIMARY_COMPARISON_EXPR: return createPrimaryComparisonExpr();
      case SqliteModelPackage.SECONDARY_COMPARISON_EXPR: return createSecondaryComparisonExpr();
      case SqliteModelPackage.COLUMN_LITERAL: return createColumnLiteral();
      case SqliteModelPackage.LITERAL: return createLiteral();
      case SqliteModelPackage.CREATE_TABLE_STATEMENT: return createCreateTableStatement();
      case SqliteModelPackage.ALTER_TABLE_STATEMENT: return createAlterTableStatement();
      case SqliteModelPackage.CREATE_VIEW_STATEMENT: return createCreateViewStatement();
      case SqliteModelPackage.ALTER_TABLE_RENAME_CLAUSE: return createAlterTableRenameClause();
      case SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_CLAUSE: return createAlterTableAddColumnClause();
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT: return createPrimaryKeyColumnConstraint();
      case SqliteModelPackage.NOT_NULL_CONSTRAINT: return createNotNullConstraint();
      case SqliteModelPackage.DEFAULT_CONSTRAINT: return createDefaultConstraint();
      case SqliteModelPackage.LITERAL_DEFAULT_VALUE: return createLiteralDefaultValue();
      case SqliteModelPackage.EXPRESSION_DEFAULT_VALUE: return createExpressionDefaultValue();
      case SqliteModelPackage.SINGLE_SOURCE_TABLE: return createSingleSourceTable();
      case SqliteModelPackage.SINGLE_SOURCE_SELECT_STATEMENT: return createSingleSourceSelectStatement();
      case SqliteModelPackage.SINGLE_SOURCE_JOIN: return createSingleSourceJoin();
      case SqliteModelPackage.RESULT_COLUMN_ALL: return createResultColumnAll();
      case SqliteModelPackage.RESULT_COLUMN_ALL_WITH_TABLE_REF: return createResultColumnAllWithTableRef();
      case SqliteModelPackage.RESULT_COLUMN_EXPRESSION: return createResultColumnExpression();
      case SqliteModelPackage.NUMERIC_LITERAL: return createNumericLiteral();
      case SqliteModelPackage.STRING_LITERAL: return createStringLiteral();
      case SqliteModelPackage.NULL_LITERAL: return createNullLiteral();
      case SqliteModelPackage.CURRENT_TIME_LITERAL: return createCurrentTimeLiteral();
      case SqliteModelPackage.CURRENT_DATE_LITERAL: return createCurrentDateLiteral();
      case SqliteModelPackage.CURRENT_TIME_STAMP_LITERAL: return createCurrentTimeStampLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SqliteModelPackage.COLUMN_TYPE:
        return createColumnTypeFromString(eDataType, initialValue);
      case SqliteModelPackage.CONFLICT_RESOLUTION:
        return createConflictResolutionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SqliteModelPackage.COLUMN_TYPE:
        return convertColumnTypeToString(eDataType, instanceValue);
      case SqliteModelPackage.CONFLICT_RESOLUTION:
        return convertConflictResolutionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseBlock createDatabaseBlock()
  {
    DatabaseBlockImpl databaseBlock = new DatabaseBlockImpl();
    return databaseBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigrationBlock createMigrationBlock()
  {
    MigrationBlockImpl migrationBlock = new MigrationBlockImpl();
    return migrationBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statment createStatment()
  {
    StatmentImpl statment = new StatmentImpl();
    return statment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDecl createTableDecl()
  {
    TableDeclImpl tableDecl = new TableDeclImpl();
    return tableDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlterTableClause createAlterTableClause()
  {
    AlterTableClauseImpl alterTableClause = new AlterTableClauseImpl();
    return alterTableClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnDef createColumnDef()
  {
    ColumnDefImpl columnDef = new ColumnDefImpl();
    return columnDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnConstraint createColumnConstraint()
  {
    ColumnConstraintImpl columnConstraint = new ColumnConstraintImpl();
    return columnConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultValue createDefaultValue()
  {
    DefaultValueImpl defaultValue = new DefaultValueImpl();
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableConstraint createTableConstraint()
  {
    TableConstraintImpl tableConstraint = new TableConstraintImpl();
    return tableConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniqueTableContraint createUniqueTableContraint()
  {
    UniqueTableContraintImpl uniqueTableContraint = new UniqueTableContraintImpl();
    return uniqueTableContraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexedColumn createIndexedColumn()
  {
    IndexedColumnImpl indexedColumn = new IndexedColumnImpl();
    return indexedColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectStatement createSelectStatement()
  {
    SelectStatementImpl selectStatement = new SelectStatementImpl();
    return selectStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectCore createSelectCore()
  {
    SelectCoreImpl selectCore = new SelectCoreImpl();
    return selectCore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinSource createJoinSource()
  {
    JoinSourceImpl joinSource = new JoinSourceImpl();
    return joinSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSource createSingleSource()
  {
    SingleSourceImpl singleSource = new SingleSourceImpl();
    return singleSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinStatement createJoinStatement()
  {
    JoinStatementImpl joinStatement = new JoinStatementImpl();
    return joinStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultColumn createResultColumn()
  {
    ResultColumnImpl resultColumn = new ResultColumnImpl();
    return resultColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConflictClause createConflictClause()
  {
    ConflictClauseImpl conflictClause = new ConflictClauseImpl();
    return conflictClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralValue createLiteralValue()
  {
    LiteralValueImpl literalValue = new LiteralValueImpl();
    return literalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpr createOrExpr()
  {
    OrExprImpl orExpr = new OrExprImpl();
    return orExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpr createAndExpr()
  {
    AndExprImpl andExpr = new AndExprImpl();
    return andExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryComparisonExpr createPrimaryComparisonExpr()
  {
    PrimaryComparisonExprImpl primaryComparisonExpr = new PrimaryComparisonExprImpl();
    return primaryComparisonExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecondaryComparisonExpr createSecondaryComparisonExpr()
  {
    SecondaryComparisonExprImpl secondaryComparisonExpr = new SecondaryComparisonExprImpl();
    return secondaryComparisonExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnLiteral createColumnLiteral()
  {
    ColumnLiteralImpl columnLiteral = new ColumnLiteralImpl();
    return columnLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateTableStatement createCreateTableStatement()
  {
    CreateTableStatementImpl createTableStatement = new CreateTableStatementImpl();
    return createTableStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlterTableStatement createAlterTableStatement()
  {
    AlterTableStatementImpl alterTableStatement = new AlterTableStatementImpl();
    return alterTableStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateViewStatement createCreateViewStatement()
  {
    CreateViewStatementImpl createViewStatement = new CreateViewStatementImpl();
    return createViewStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlterTableRenameClause createAlterTableRenameClause()
  {
    AlterTableRenameClauseImpl alterTableRenameClause = new AlterTableRenameClauseImpl();
    return alterTableRenameClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlterTableAddColumnClause createAlterTableAddColumnClause()
  {
    AlterTableAddColumnClauseImpl alterTableAddColumnClause = new AlterTableAddColumnClauseImpl();
    return alterTableAddColumnClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryKeyColumnConstraint createPrimaryKeyColumnConstraint()
  {
    PrimaryKeyColumnConstraintImpl primaryKeyColumnConstraint = new PrimaryKeyColumnConstraintImpl();
    return primaryKeyColumnConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotNullConstraint createNotNullConstraint()
  {
    NotNullConstraintImpl notNullConstraint = new NotNullConstraintImpl();
    return notNullConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultConstraint createDefaultConstraint()
  {
    DefaultConstraintImpl defaultConstraint = new DefaultConstraintImpl();
    return defaultConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralDefaultValue createLiteralDefaultValue()
  {
    LiteralDefaultValueImpl literalDefaultValue = new LiteralDefaultValueImpl();
    return literalDefaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionDefaultValue createExpressionDefaultValue()
  {
    ExpressionDefaultValueImpl expressionDefaultValue = new ExpressionDefaultValueImpl();
    return expressionDefaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSourceTable createSingleSourceTable()
  {
    SingleSourceTableImpl singleSourceTable = new SingleSourceTableImpl();
    return singleSourceTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSourceSelectStatement createSingleSourceSelectStatement()
  {
    SingleSourceSelectStatementImpl singleSourceSelectStatement = new SingleSourceSelectStatementImpl();
    return singleSourceSelectStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSourceJoin createSingleSourceJoin()
  {
    SingleSourceJoinImpl singleSourceJoin = new SingleSourceJoinImpl();
    return singleSourceJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultColumnAll createResultColumnAll()
  {
    ResultColumnAllImpl resultColumnAll = new ResultColumnAllImpl();
    return resultColumnAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultColumnAllWithTableRef createResultColumnAllWithTableRef()
  {
    ResultColumnAllWithTableRefImpl resultColumnAllWithTableRef = new ResultColumnAllWithTableRefImpl();
    return resultColumnAllWithTableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultColumnExpression createResultColumnExpression()
  {
    ResultColumnExpressionImpl resultColumnExpression = new ResultColumnExpressionImpl();
    return resultColumnExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericLiteral createNumericLiteral()
  {
    NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
    return numericLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrentTimeLiteral createCurrentTimeLiteral()
  {
    CurrentTimeLiteralImpl currentTimeLiteral = new CurrentTimeLiteralImpl();
    return currentTimeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrentDateLiteral createCurrentDateLiteral()
  {
    CurrentDateLiteralImpl currentDateLiteral = new CurrentDateLiteralImpl();
    return currentDateLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrentTimeStampLiteral createCurrentTimeStampLiteral()
  {
    CurrentTimeStampLiteralImpl currentTimeStampLiteral = new CurrentTimeStampLiteralImpl();
    return currentTimeStampLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnType createColumnTypeFromString(EDataType eDataType, String initialValue)
  {
    ColumnType result = ColumnType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColumnTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConflictResolution createConflictResolutionFromString(EDataType eDataType, String initialValue)
  {
    ConflictResolution result = ConflictResolution.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConflictResolutionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqliteModelPackage getSqliteModelPackage()
  {
    return (SqliteModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SqliteModelPackage getPackage()
  {
    return SqliteModelPackage.eINSTANCE;
  }

} //SqliteModelFactoryImpl