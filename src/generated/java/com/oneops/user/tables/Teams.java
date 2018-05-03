/*
 * This file is generated by jOOQ.
 */
package com.oneops.user.tables;

import com.oneops.user.*;
import com.oneops.user.tables.records.TeamsRecord;
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
public class Teams extends TableImpl<TeamsRecord> {

  private static final long serialVersionUID = 1394518658;

  /** The reference instance of <code>public.teams</code> */
  public static final Teams TEAMS = new Teams();

  /** The class holding records for this type */
  @Override
  public Class<TeamsRecord> getRecordType() {
    return TeamsRecord.class;
  }

  /** The column <code>public.teams.id</code>. */
  public final TableField<TeamsRecord, Integer> ID =
      createField(
          "id",
          org.jooq.impl.SQLDataType.INTEGER
              .nullable(false)
              .defaultValue(
                  org.jooq.impl.DSL.field(
                      "nextval('teams_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)),
          this,
          "");

  /** The column <code>public.teams.name</code>. */
  public final TableField<TeamsRecord, String> NAME =
      createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

  /** The column <code>public.teams.organization_id</code>. */
  public final TableField<TeamsRecord, Integer> ORGANIZATION_ID =
      createField("organization_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

  /** The column <code>public.teams.created_at</code>. */
  public final TableField<TeamsRecord, Timestamp> CREATED_AT =
      createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

  /** The column <code>public.teams.updated_at</code>. */
  public final TableField<TeamsRecord, Timestamp> UPDATED_AT =
      createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

  /** The column <code>public.teams.description</code>. */
  public final TableField<TeamsRecord, String> DESCRIPTION =
      createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

  /** The column <code>public.teams.design</code>. */
  public final TableField<TeamsRecord, Boolean> DESIGN =
      createField(
          "design",
          org.jooq.impl.SQLDataType.BOOLEAN
              .nullable(false)
              .defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)),
          this,
          "");

  /** The column <code>public.teams.transition</code>. */
  public final TableField<TeamsRecord, Boolean> TRANSITION =
      createField(
          "transition",
          org.jooq.impl.SQLDataType.BOOLEAN
              .nullable(false)
              .defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)),
          this,
          "");

  /** The column <code>public.teams.operations</code>. */
  public final TableField<TeamsRecord, Boolean> OPERATIONS =
      createField(
          "operations",
          org.jooq.impl.SQLDataType.BOOLEAN
              .nullable(false)
              .defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)),
          this,
          "");

  /** The column <code>public.teams.org_scope</code>. */
  public final TableField<TeamsRecord, Boolean> ORG_SCOPE =
      createField(
          "org_scope",
          org.jooq.impl.SQLDataType.BOOLEAN
              .nullable(false)
              .defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)),
          this,
          "");

  /** The column <code>public.teams.manages_access</code>. */
  public final TableField<TeamsRecord, Boolean> MANAGES_ACCESS =
      createField(
          "manages_access",
          org.jooq.impl.SQLDataType.BOOLEAN
              .nullable(false)
              .defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)),
          this,
          "");

  /** The column <code>public.teams.cloud_services</code>. */
  public final TableField<TeamsRecord, Boolean> CLOUD_SERVICES =
      createField(
          "cloud_services",
          org.jooq.impl.SQLDataType.BOOLEAN
              .nullable(false)
              .defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)),
          this,
          "");

  /** The column <code>public.teams.cloud_compliance</code>. */
  public final TableField<TeamsRecord, Boolean> CLOUD_COMPLIANCE =
      createField(
          "cloud_compliance",
          org.jooq.impl.SQLDataType.BOOLEAN
              .nullable(false)
              .defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)),
          this,
          "");

  /** The column <code>public.teams.cloud_support</code>. */
  public final TableField<TeamsRecord, Boolean> CLOUD_SUPPORT =
      createField(
          "cloud_support",
          org.jooq.impl.SQLDataType.BOOLEAN
              .nullable(false)
              .defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)),
          this,
          "");

  /** Create a <code>public.teams</code> table reference */
  public Teams() {
    this("teams", null);
  }

  /** Create an aliased <code>public.teams</code> table reference */
  public Teams(String alias) {
    this(alias, TEAMS);
  }

  private Teams(String alias, Table<TeamsRecord> aliased) {
    this(alias, aliased, null);
  }

  private Teams(String alias, Table<TeamsRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, "");
  }

  /** {@inheritDoc} */
  @Override
  public Schema getSchema() {
    return Public.PUBLIC;
  }

  /** {@inheritDoc} */
  @Override
  public Identity<TeamsRecord, Integer> getIdentity() {
    return Keys.IDENTITY_TEAMS;
  }

  /** {@inheritDoc} */
  @Override
  public UniqueKey<TeamsRecord> getPrimaryKey() {
    return Keys.TEAMS_PKEY;
  }

  /** {@inheritDoc} */
  @Override
  public List<UniqueKey<TeamsRecord>> getKeys() {
    return Arrays.<UniqueKey<TeamsRecord>>asList(Keys.TEAMS_PKEY);
  }

  /** {@inheritDoc} */
  @Override
  public Teams as(String alias) {
    return new Teams(alias, this);
  }

  /** Rename this table */
  @Override
  public Teams rename(String name) {
    return new Teams(name, null);
  }
}
