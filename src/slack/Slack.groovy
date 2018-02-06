void slackNotification(String status){
    String messageBody = "${env.JOB_NAME}, #${env.BUILD_NUMBER}\
 (<${env.RUN_DISPLAY_URL}|open>, <${env.RUN_CHANGES_DISPLAY_URL}|changes>)"
    color = '#323232'
    message = 'Here the message'

    if(status == 'ok'){
        messageHeader = "Build Success - "
        message = messageHeader + messageBody
        color = '#00b200'
    }
    else if (status == 'fail'){
        messageHeader = "Build Failed - "
        message = messageHeader + messageBody
        color = '#E83C3C'
    }
    else if (status == 'start'){
        messageHeader = "Build Started - "
        message = messageHeader + messageBody
        color = '#2D89E5'
    }
    else {
        println('possible messages: "start", "ok" or "fail"')
    }
    slackSend color: color, message: message
}
