/*
 * @(#)MainScreen.java
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

import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;


/**
 * The <code>MainScreen</code> class implements a form used to gather the data needed to calculate the tip.
 *
 * @author <a href="http://www.thauvin.net/erik/">Erik C. Thauvin</a>
 * @version $Revision$, $Date$
 *
 * @created September 16, 2004
 * @since 1.0
 */
public class MainScreen extends Form
{
	/**
	 * The tip rate popup.
	 */
	protected /* final */ ChoiceGroup tipPopup;

	/**
	 * The tax total field.
	 */
	protected /* final */ TextField taxFld;

	/**
	 * The bill total field.
	 */
	protected /* final */ TextField totalFld;

	/**
	 * Creates a new MainScreen object.
	 *
	 * @param midlet The MIDlet instance.
	 */
	public MainScreen(TipME midlet)
	{
		super(midlet.appName);

		taxFld = new TextField("Tax Amount: ", midlet.taxAmount, 10, TextField.DECIMAL);
		totalFld = new TextField("Bill Amount: ", midlet.totalAmount, 10, TextField.DECIMAL);
		tipPopup =
			new ChoiceGroup("Tip %:", ChoiceGroup.POPUP, new String[] { "5", "10", "15", "20", "25", "30" }, null);
		tipPopup.setSelectedIndex(2, true);
		append(taxFld);
		append(totalFld);
		append(tipPopup);

		addCommand(midlet.aboutCommand);
		addCommand(midlet.clearCommand);
		addCommand(midlet.exitCommand);
		addCommand(midlet.calcCommand);

		setCommandListener(midlet);
	}
}
