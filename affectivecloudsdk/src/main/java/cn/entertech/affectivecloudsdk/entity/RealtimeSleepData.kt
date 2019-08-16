package cn.entertech.affectivecloudsdk.entity

data class RealtimeSleepData(
    var sleepDegree: Double? = null,
    var sleepState: Double? = null
){

    override fun toString(): String {
        return "RealtimeSleepData(sleepDegree=$sleepDegree, sleepState=$sleepState)"
    }
}