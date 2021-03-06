package cn.entertech.affectivecloudsdk.entity

import com.google.gson.annotations.SerializedName

data class Request(@SerializedName("services") val services:String,@SerializedName("op") val op:String){
    companion object {
        val REQUEST_SERVICES_SESSION = "session"
        val REQUEST_SERVICES_BIODATA = "biodata"
        val REQUEST_SERVICES_AFFECTIVE = "affective"

        val REQUEST_OPTION_SESSION_CREATE = "create"
        val REQUEST_OPTION_SESSION_CLOSE = "close"
        val REQUEST_OPTION_SESSION_RESTORE = "restore"

        val REQUEST_OPTION_SUBSCRIBE = "subscribe"
        val REQUEST_OPTION_UNSUBSCRIBE = "unsubscribe"

        val REQUEST_OPTION_BIODATA_INIT = "init"
        val REQUEST_OPTION_BIODATA_UPLOAD = "upload"
        val REQUEST_OPTION_BIODATA_REPORT = "report"

        val REQUEST_OPTION_AFFECTIVE_START = "start"
        val REQUEST_OPTION_AFFECTIVE_REPORT = "report"
        val REQUEST_OPTION_AFFECTIVE_FINISH = "finish"

        val REQUEST_OPTION_SUBMIT = "submit"
    }
}