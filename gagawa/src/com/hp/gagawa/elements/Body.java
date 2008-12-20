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


public class Body extends FertileNode {

	public Body(){
		super("body");
	}


	public Body setAlink(String value){setAttribute("alink", value); return this;}
	public String getAlink(){return getAttribute("alink");}
	public boolean removeAlink(){return removeAttribute("alink");}

	public Body setBackground(String value){setAttribute("background", value); return this;}
	public String getBackground(){return getAttribute("background");}
	public boolean removeBackground(){return removeAttribute("background");}

	public Body setBgcolor(String value){setAttribute("bgcolor", value); return this;}
	public String getBgcolor(){return getAttribute("bgcolor");}
	public boolean removeBgcolor(){return removeAttribute("bgcolor");}

	public Body setLink(String value){setAttribute("link", value); return this;}
	public String getLink(){return getAttribute("link");}
	public boolean removeLink(){return removeAttribute("link");}

	public Body setText(String value){setAttribute("text", value); return this;}
	public String getText(){return getAttribute("text");}
	public boolean removeText(){return removeAttribute("text");}

	public Body setVlink(String value){setAttribute("vlink", value); return this;}
	public String getVlink(){return getAttribute("vlink");}
	public boolean removeVlink(){return removeAttribute("vlink");}

	public Body setId(String value){setAttribute("id", value); return this;}
	public String getId(){return getAttribute("id");}
	public boolean removeId(){return removeAttribute("id");}

	public Body setCSSClass(String value){setAttribute("class", value); return this;}
	public String getCSSClass(){return getAttribute("class");}
	public boolean removeCSSClass(){return removeAttribute("class");}

	public Body setTitle(String value){setAttribute("title", value); return this;}
	public String getTitle(){return getAttribute("title");}
	public boolean removeTitle(){return removeAttribute("title");}

	public Body setStyle(String value){setAttribute("style", value); return this;}
	public String getStyle(){return getAttribute("style");}
	public boolean removeStyle(){return removeAttribute("style");}

	public Body setDir(String value){setAttribute("dir", value); return this;}
	public String getDir(){return getAttribute("dir");}
	public boolean removeDir(){return removeAttribute("dir");}

	public Body setLang(String value){setAttribute("lang", value); return this;}
	public String getLang(){return getAttribute("lang");}
	public boolean removeLang(){return removeAttribute("lang");}

	public Body setXMLLang(String value){setAttribute("xml:lang", value); return this;}
	public String getXMLLang(){return getAttribute("xml:lang");}
	public boolean removeXMLLang(){return removeAttribute("xml:lang");}

}
