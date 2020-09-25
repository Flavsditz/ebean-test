package com.example.model.query;

import com.example.model.Company;
import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PBoolean;
import io.ebean.typequery.PString;
import io.ebean.typequery.PUuid;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;

/**
 * Query bean for Company.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean("v1")
public class QCompany extends TQRootBean<Company,QCompany> {

  private static final QCompany _alias = new QCompany(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QCompany alias() {
    return _alias;
  }

  public PUuid<QCompany> companyId;
  public PString<QCompany> name;
  public PBoolean<QCompany> isPublic;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QCompany forFetchGroup() {
    return new QCompany(FetchGroup.queryFor(Company.class));
  }

  /**
   * Construct using the default Database.
   */
  public QCompany() {
    super(Company.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QCompany(Transaction transaction) {
    super(Company.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QCompany(Database database) {
    super(Company.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QCompany(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QCompany(Query<Company> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PUuid<QCompany> companyId = _alias.companyId;
    public static PString<QCompany> name = _alias.name;
    public static PBoolean<QCompany> isPublic = _alias.isPublic;
  }
}
