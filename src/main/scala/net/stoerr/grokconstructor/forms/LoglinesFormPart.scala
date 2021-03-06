package net.stoerr.grokconstructor.forms

import net.stoerr.grokconstructor.webframework.WebForm

/**
 * Form for input of some loglines.
 * @author <a href="http://www.stoerr.net/">Hans-Peter Stoerr</a>
 * @since 01.03.13
 */
trait LoglinesFormPart extends WebForm {

  val loglines = InputText("loglines")

  def loglinesEntry = loglines.inputTextArea("Some log lines you want to match. It's helps much to use several lines, and to choose lines that are as diverse as possible.", 180, 20)

}
