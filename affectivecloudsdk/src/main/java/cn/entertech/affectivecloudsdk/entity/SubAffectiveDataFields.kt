package cn.entertech.affectivecloudsdk.entity

import com.google.gson.annotations.SerializedName

data class SubAffectiveDataFields(
    @SerializedName("subAttentionFields") var subAttentionFields: List<String>? = null,
    @SerializedName("subRelaxationFields") var subRelaxationFields: List<String>? = null,
    @SerializedName("subPressureFields") var subPressureFields: List<String>? = null,
    @SerializedName("subPleasureFields") var subPleasureFields: List<String>? = null,
    @SerializedName("subArousalFields") var subArousalFields: List<String>? = null,
    @SerializedName("subSleepFields") var subSleepFields: List<String>? = null,
    @SerializedName("subCoherenceFields") var subCoherenceFields: List<String>? = null
){
    override fun toString(): String {
        return "SubAffectiveDataFields(subAttentionFields=$subAttentionFields, subRelaxationFields=$subRelaxationFields, subPressureFields=$subPressureFields, subPleasureFields=$subPleasureFields, subArousalFields=$subArousalFields, subSleepFields=$subSleepFields, subCoherenceFields=$subCoherenceFields)"
    }
}