import com.kms.katalon.core.util.KeywordUtil

/**
 * Extending KeywordLogger class on the fly.
 * Add a new method "forkInfo(String msg)" which logs messages into a file as you like
 * as well as calling "logInfo(String msg)" internally.
 */
File out = new File('./output2.log')
if (out.exists()) {
	out.delete()
}
KeywordUtil.metaClass.static.forkInfo = { String message ->
	out.append(message)
	delegate.logInfo(message);
}

KeywordUtil.forkInfo("TESTING LOGGER IN KATALON\n")
KeywordUtil.forkInfo("TESTING LOGGER IN KATALON again\n")
KeywordUtil.forkInfo("TESTING LOGGER IN KATALON again and again\n")
