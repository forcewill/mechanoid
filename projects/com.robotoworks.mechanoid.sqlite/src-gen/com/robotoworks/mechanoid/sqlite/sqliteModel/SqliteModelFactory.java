/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage
 * @generated
 */
public interface SqliteModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SqliteModelFactory eINSTANCE = com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Database Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database Block</em>'.
   * @generated
   */
  DatabaseBlock createDatabaseBlock();

  /**
   * Returns a new object of class '<em>Migration Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Migration Block</em>'.
   * @generated
   */
  MigrationBlock createMigrationBlock();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Statment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statment</em>'.
   * @generated
   */
  Statment createStatment();

  /**
   * Returns a new object of class '<em>Table Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Decl</em>'.
   * @generated
   */
  TableDecl createTableDecl();

  /**
   * Returns a new object of class '<em>Alter Table Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alter Table Clause</em>'.
   * @generated
   */
  AlterTableClause createAlterTableClause();

  /**
   * Returns a new object of class '<em>Column Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Def</em>'.
   * @generated
   */
  ColumnDef createColumnDef();

  /**
   * Returns a new object of class '<em>Column Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Constraint</em>'.
   * @generated
   */
  ColumnConstraint createColumnConstraint();

  /**
   * Returns a new object of class '<em>Default Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Value</em>'.
   * @generated
   */
  DefaultValue createDefaultValue();

  /**
   * Returns a new object of class '<em>Table Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Constraint</em>'.
   * @generated
   */
  TableConstraint createTableConstraint();

  /**
   * Returns a new object of class '<em>Unique Table Contraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unique Table Contraint</em>'.
   * @generated
   */
  UniqueTableContraint createUniqueTableContraint();

  /**
   * Returns a new object of class '<em>Indexed Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indexed Column</em>'.
   * @generated
   */
  IndexedColumn createIndexedColumn();

  /**
   * Returns a new object of class '<em>Select Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Statement</em>'.
   * @generated
   */
  SelectStatement createSelectStatement();

  /**
   * Returns a new object of class '<em>Select Core</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Core</em>'.
   * @generated
   */
  SelectCore createSelectCore();

  /**
   * Returns a new object of class '<em>Join Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join Source</em>'.
   * @generated
   */
  JoinSource createJoinSource();

  /**
   * Returns a new object of class '<em>Single Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Source</em>'.
   * @generated
   */
  SingleSource createSingleSource();

  /**
   * Returns a new object of class '<em>Join Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join Statement</em>'.
   * @generated
   */
  JoinStatement createJoinStatement();

  /**
   * Returns a new object of class '<em>Result Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Column</em>'.
   * @generated
   */
  ResultColumn createResultColumn();

  /**
   * Returns a new object of class '<em>Conflict Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conflict Clause</em>'.
   * @generated
   */
  ConflictClause createConflictClause();

  /**
   * Returns a new object of class '<em>Literal Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Value</em>'.
   * @generated
   */
  LiteralValue createLiteralValue();

  /**
   * Returns a new object of class '<em>Or Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Expr</em>'.
   * @generated
   */
  OrExpr createOrExpr();

  /**
   * Returns a new object of class '<em>And Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expr</em>'.
   * @generated
   */
  AndExpr createAndExpr();

  /**
   * Returns a new object of class '<em>Primary Comparison Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Comparison Expr</em>'.
   * @generated
   */
  PrimaryComparisonExpr createPrimaryComparisonExpr();

  /**
   * Returns a new object of class '<em>Secondary Comparison Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Secondary Comparison Expr</em>'.
   * @generated
   */
  SecondaryComparisonExpr createSecondaryComparisonExpr();

  /**
   * Returns a new object of class '<em>Column Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Literal</em>'.
   * @generated
   */
  ColumnLiteral createColumnLiteral();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Create Table Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Table Statement</em>'.
   * @generated
   */
  CreateTableStatement createCreateTableStatement();

  /**
   * Returns a new object of class '<em>Alter Table Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alter Table Statement</em>'.
   * @generated
   */
  AlterTableStatement createAlterTableStatement();

  /**
   * Returns a new object of class '<em>Create View Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create View Statement</em>'.
   * @generated
   */
  CreateViewStatement createCreateViewStatement();

  /**
   * Returns a new object of class '<em>Alter Table Rename Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alter Table Rename Clause</em>'.
   * @generated
   */
  AlterTableRenameClause createAlterTableRenameClause();

  /**
   * Returns a new object of class '<em>Alter Table Add Column Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alter Table Add Column Clause</em>'.
   * @generated
   */
  AlterTableAddColumnClause createAlterTableAddColumnClause();

  /**
   * Returns a new object of class '<em>Primary Key Column Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Key Column Constraint</em>'.
   * @generated
   */
  PrimaryKeyColumnConstraint createPrimaryKeyColumnConstraint();

  /**
   * Returns a new object of class '<em>Not Null Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Null Constraint</em>'.
   * @generated
   */
  NotNullConstraint createNotNullConstraint();

  /**
   * Returns a new object of class '<em>Default Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Constraint</em>'.
   * @generated
   */
  DefaultConstraint createDefaultConstraint();

  /**
   * Returns a new object of class '<em>Literal Default Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Default Value</em>'.
   * @generated
   */
  LiteralDefaultValue createLiteralDefaultValue();

  /**
   * Returns a new object of class '<em>Expression Default Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Default Value</em>'.
   * @generated
   */
  ExpressionDefaultValue createExpressionDefaultValue();

  /**
   * Returns a new object of class '<em>Single Source Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Source Table</em>'.
   * @generated
   */
  SingleSourceTable createSingleSourceTable();

  /**
   * Returns a new object of class '<em>Single Source Select Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Source Select Statement</em>'.
   * @generated
   */
  SingleSourceSelectStatement createSingleSourceSelectStatement();

  /**
   * Returns a new object of class '<em>Single Source Join</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Source Join</em>'.
   * @generated
   */
  SingleSourceJoin createSingleSourceJoin();

  /**
   * Returns a new object of class '<em>Result Column All</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Column All</em>'.
   * @generated
   */
  ResultColumnAll createResultColumnAll();

  /**
   * Returns a new object of class '<em>Result Column All With Table Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Column All With Table Ref</em>'.
   * @generated
   */
  ResultColumnAllWithTableRef createResultColumnAllWithTableRef();

  /**
   * Returns a new object of class '<em>Result Column Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Column Expression</em>'.
   * @generated
   */
  ResultColumnExpression createResultColumnExpression();

  /**
   * Returns a new object of class '<em>Numeric Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Literal</em>'.
   * @generated
   */
  NumericLiteral createNumericLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Literal</em>'.
   * @generated
   */
  NullLiteral createNullLiteral();

  /**
   * Returns a new object of class '<em>Current Time Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Current Time Literal</em>'.
   * @generated
   */
  CurrentTimeLiteral createCurrentTimeLiteral();

  /**
   * Returns a new object of class '<em>Current Date Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Current Date Literal</em>'.
   * @generated
   */
  CurrentDateLiteral createCurrentDateLiteral();

  /**
   * Returns a new object of class '<em>Current Time Stamp Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Current Time Stamp Literal</em>'.
   * @generated
   */
  CurrentTimeStampLiteral createCurrentTimeStampLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SqliteModelPackage getSqliteModelPackage();

} //SqliteModelFactory