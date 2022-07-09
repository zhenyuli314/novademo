/*
 * This file is generated by jOOQ.
 */
package com.nova.novademo.codegen.keys


import com.nova.novademo.codegen.tables.TNovaUser
import com.nova.novademo.codegen.tables.records.NovaUserRecord

import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val KEY_NOVA_USER_PRIMARY: UniqueKey<NovaUserRecord> = Internal.createUniqueKey(TNovaUser.NOVA_USER, DSL.name("KEY_nova_user_PRIMARY"), arrayOf(TNovaUser.NOVA_USER.ID), true)
