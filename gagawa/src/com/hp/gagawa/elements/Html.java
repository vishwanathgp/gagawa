package com.hp.gagawa.elements;

import com.hp.gagawa.FertileNode;

/**
(c) Copyright 2008 Hewlett-Packard Development Company, L.P.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.*/


public class Html extends FertileNode {

	public Html(){
		super("html");
		setXmlns("http://www.w3.org/1999/xhtml");	
	}


	public Html setXmlns(String value){setAttribute("xmlns", value); return this;}
	public String getXmlns(){return getAttribute("xmlns");}
	public boolean removeXmlns(){return removeAttribute("xmlns");}

	public Html setDir(String value){setAttribute("dir", value); return this;}
	public String getDir(){return getAttribute("dir");}
	public boolean removeDir(){return removeAttribute("dir");}

	public Html setLang(String value){setAttribute("lang", value); return this;}
	public String getLang(){return getAttribute("lang");}
	public boolean removeLang(){return removeAttribute("lang");}

	public Html setXMLLang(String value){setAttribute("xml:lang", value); return this;}
	public String getXMLLang(){return getAttribute("xml:lang");}
	public boolean removeXMLLang(){return removeAttribute("xml:lang");}

}
