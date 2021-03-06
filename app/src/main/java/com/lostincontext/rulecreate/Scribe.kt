package com.lostincontext.rulecreate

import android.content.Context
import android.content.res.Resources
import android.text.TextUtils
import com.lostincontext.R
import com.lostincontext.data.fences.FenceNamer
import com.lostincontext.data.rule.AtomicCondition
import com.lostincontext.data.rule.Condition

class Scribe(val context: Context) {

    val resources: Resources = context.resources
    val theme: Resources.Theme = context.theme

    fun describeCondition(condition: Condition): CharSequence {
        val description = resources.getString(R.string.when_x)
        return TextUtils.expandTemplate(description,
                                        describeAtomicConditions(condition.atomics))

    }

    fun describeAtomicConditions(conditions: List<AtomicCondition>): CharSequence {
        val namer = FenceNamer(context)

        val template = resources.getString(R.string.x_and_y)

        when (conditions.size) {
            0 -> return ""
            else ->
                return conditions.fold("" as CharSequence) { s, atomic ->
                    if (s.isEmpty()) atomic.getModifiedFence().name(namer)
                    else TextUtils.expandTemplate(template,
                                                  s,
                                                  atomic.getModifiedFence().name(namer))
                }
        }


    }

}