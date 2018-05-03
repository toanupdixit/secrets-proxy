/*
 * This file is generated by jOOQ.
 */
package com.oneops.user.tables;

import com.oneops.user.*;
import com.oneops.user.tables.records.GroupsRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.*;

/** This class is generated by jOOQ. */
@Generated(
  value = {"http://www.jooq.org", "jOOQ version:3.9.2"},
  comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Groups extends TableImpl<GroupsRecord> {

  private static final long serialVersionUID = 1597539907;

  /** The reference instance of <code>public.groups</code> */
  public static final Groups GROUPS = new Groups();

  /** The class holding records for this type */
  @Override
  public Class<GroupsRecord> getRecordType() {
    return GroupsRecord.class;
  }

  /** The column <code>public.groups.id</code>. */
  public final TableField<GroupsRecord, Integer> ID =
      createField(
          "id",
          org.jooq.impl.SQLDataType.INTEGER
              .nullable(false)
              .defaultValue(
                  org.jooq.impl.DSL.field(
                      "nextval('groups_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)),
          this,
          "");

  /** The column <code>public.groups.name</code>. */
  public final TableField<GroupsRecord, String> NAME =
      createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

  /** The column <code>public.groups.created_by</code>. */
  public final TableField<GroupsRecord, String> CREATED_BY =
      createField(
          "created_by", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

  /** The column <code>public.groups.description</code>. */
  public final TableField<GroupsRecord, String> DESCRIPTION =
      createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

  /** The column <code>public.groups.created_at</code>. */
  public final TableField<GroupsRecord, Timestamp> CREATED_AT =
      createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

  /** The column <code>public.groups.updated_at</code>. */
  public final TableField<GroupsRecord, Timestamp> UPDATED_AT =
      createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

  /** Create a <code>public.groups</code> table reference */
  public Groups() {
    this("groups", null);
  }

  /** Create an aliased <code>public.groups</code> table reference */
  public Groups(String alias) {
    this(alias, GROUPS);
  }

  private Groups(String alias, Table<GroupsRecord> aliased) {
    this(alias, aliased, null);
  }

  private Groups(String alias, Table<GroupsRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, "");
  }

  /** {@inheritDoc} */
  @Override
  public Schema getSchema() {
    return Public.PUBLIC;
  }

  /** {@inheritDoc} */
  @Override
  public Identity<GroupsRecord, Integer> getIdentity() {
    return Keys.IDENTITY_GROUPS;
  }

  /** {@inheritDoc} */
  @Override
  public UniqueKey<GroupsRecord> getPrimaryKey() {
    return Keys.GROUPS_PKEY;
  }

  /** {@inheritDoc} */
  @Override
  public List<UniqueKey<GroupsRecord>> getKeys() {
    return Arrays.<UniqueKey<GroupsRecord>>asList(Keys.GROUPS_PKEY);
  }

  /** {@inheritDoc} */
  @Override
  public Groups as(String alias) {
    return new Groups(alias, this);
  }

  /** Rename this table */
  @Override
  public Groups rename(String name) {
    return new Groups(name, null);
  }
}
