import com.kms.katalon.core.util.KeywordUtil


/**
 * Extending KeyworUtil class on the fly.
 * Override the predefined "logInfo(String msg)" method 
 * so that it logs messages into a file as you like
 * while retaining its original behavior
 * 
 * You can find the source of the KeywordUtil class at
 * https://github.com/katalon-studio/katalon-studio-testing-framework/blob/master/Include/scripts/groovy/com/kms/katalon/core/util/KeywordUtil.java
 */
File out = new File('./output3.log')
if (out.exists()) {
	out.delete()
}
KeywordUtil.metaClass.static.logInfo = { String message ->
	out.append(message)
	delegate.logger.logInfo(message)
}

KeywordUtil.logInfo("TESTING LOGGER IN KATALON\n")
KeywordUtil.logInfo("TESTING LOGGER IN KATALON again\n")
KeywordUtil.logInfo("TESTING LOGGER IN KATALON again and again\n")
