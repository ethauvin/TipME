/*
 * @(#)ResultScreen.java
 *
 * Copyright (c) 2004, Erik C. Thauvin (http://www.thauvin.net/erik/)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the authors nor the names of its contributors may be
 * used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * $Id$
 *
 */
package net.thauvin.j2me.tipme;

import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.StringItem;


/**
 * The <code>ResultScreen</code> class inplements the form used to display the results.
 *
 * @author <a href="http://www.thauvin.net/erik/">Erik C. Thauvin</a>
 * @version $Revision$, $Date$
 *
 * @created September 16, 2004
 * @since 1.0
 */
public class ResultScreen extends Form
{
	/**
	 * The subtotal item.
	 */
	protected /* final */ StringItem subtotalItem = new StringItem("Subtotal:", "\n");

	/**
	 * The tax item.
	 */
	protected /* final */ StringItem taxItem = new StringItem("Tax:", "\n");

	/**
	 * The tip item.
	 */
	protected /* final */ StringItem tipItem = new StringItem("Tip:", "\n");

	/**
	 * The total item.
	 */
	protected /* final */ StringItem totalItem = new StringItem("Total:", "");

	/**
	 * Creates a new ResultForm object.
	 *
	 * @param midlet The MIDlet instance.
	 */
	public ResultScreen(TipME midlet)
	{
		super(midlet.appName);

		append(subtotalItem);
		append(taxItem);
		append(tipItem);
		append(totalItem);

		addCommand(midlet.exitCommand);
		addCommand(midlet.backCommand);

		setCommandListener(midlet);
	}
}
