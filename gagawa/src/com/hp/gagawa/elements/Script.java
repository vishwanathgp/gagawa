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


public class Script extends FertileNode {

	public Script(String type){
		super("script");
		setType(type);	}


	public Script setType(String value){setAttribute("type", value); return this;}
	public String getType(){return getAttribute("type");}
	public boolean removeType(){return removeAttribute("type");}

	public Script setCharset(String value){setAttribute("charset", value); return this;}
	public String getCharset(){return getAttribute("charset");}
	public boolean removeCharset(){return removeAttribute("charset");}

	public Script setDefer(String value){setAttribute("defer", value); return this;}
	public String getDefer(){return getAttribute("defer");}
	public boolean removeDefer(){return removeAttribute("defer");}

	public Script setLanguage(String value){setAttribute("language", value); return this;}
	public String getLanguage(){return getAttribute("language");}
	public boolean removeLanguage(){return removeAttribute("language");}

	public Script setSrc(String value){setAttribute("src", value); return this;}
	public String getSrc(){return getAttribute("src");}
	public boolean removeSrc(){return removeAttribute("src");}

	public Script setXmlspace(String value){setAttribute("xmlspace", value); return this;}
	public String getXmlspace(){return getAttribute("xmlspace");}
	public boolean removeXmlspace(){return removeAttribute("xmlspace");}

}
