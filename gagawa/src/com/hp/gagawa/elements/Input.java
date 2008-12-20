package com.hp.gagawa.elements;

import com.hp.gagawa.Node;

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


public class Input extends Node {

	public Input(){
		super("input");
	}


	public Input setAccept(String value){setAttribute("accept", value); return this;}
	public String getAccept(){return getAttribute("accept");}
	public boolean removeAccept(){return removeAttribute("accept");}

	public Input setAlign(String value){setAttribute("align", value); return this;}
	public String getAlign(){return getAttribute("align");}
	public boolean removeAlign(){return removeAttribute("align");}

	public Input setAlt(String value){setAttribute("alt", value); return this;}
	public String getAlt(){return getAttribute("alt");}
	public boolean removeAlt(){return removeAttribute("alt");}

	public Input setChecked(String value){setAttribute("checked", value); return this;}
	public String getChecked(){return getAttribute("checked");}
	public boolean removeChecked(){return removeAttribute("checked");}

	public Input setDisabled(String value){setAttribute("disabled", value); return this;}
	public String getDisabled(){return getAttribute("disabled");}
	public boolean removeDisabled(){return removeAttribute("disabled");}

	public Input setMaxlength(String value){setAttribute("maxlength", value); return this;}
	public String getMaxlength(){return getAttribute("maxlength");}
	public boolean removeMaxlength(){return removeAttribute("maxlength");}

	public Input setName(String value){setAttribute("name", value); return this;}
	public String getName(){return getAttribute("name");}
	public boolean removeName(){return removeAttribute("name");}

	public Input setReadonly(String value){setAttribute("readonly", value); return this;}
	public String getReadonly(){return getAttribute("readonly");}
	public boolean removeReadonly(){return removeAttribute("readonly");}

	public Input setSize(String value){setAttribute("size", value); return this;}
	public String getSize(){return getAttribute("size");}
	public boolean removeSize(){return removeAttribute("size");}

	public Input setSrc(String value){setAttribute("src", value); return this;}
	public String getSrc(){return getAttribute("src");}
	public boolean removeSrc(){return removeAttribute("src");}

	public Input setType(String value){setAttribute("type", value); return this;}
	public String getType(){return getAttribute("type");}
	public boolean removeType(){return removeAttribute("type");}

	public Input setValue(String value){setAttribute("value", value); return this;}
	public String getValue(){return getAttribute("value");}
	public boolean removeValue(){return removeAttribute("value");}

	public Input setId(String value){setAttribute("id", value); return this;}
	public String getId(){return getAttribute("id");}
	public boolean removeId(){return removeAttribute("id");}

	public Input setCSSClass(String value){setAttribute("class", value); return this;}
	public String getCSSClass(){return getAttribute("class");}
	public boolean removeCSSClass(){return removeAttribute("class");}

	public Input setTitle(String value){setAttribute("title", value); return this;}
	public String getTitle(){return getAttribute("title");}
	public boolean removeTitle(){return removeAttribute("title");}

	public Input setStyle(String value){setAttribute("style", value); return this;}
	public String getStyle(){return getAttribute("style");}
	public boolean removeStyle(){return removeAttribute("style");}

	public Input setDir(String value){setAttribute("dir", value); return this;}
	public String getDir(){return getAttribute("dir");}
	public boolean removeDir(){return removeAttribute("dir");}

	public Input setLang(String value){setAttribute("lang", value); return this;}
	public String getLang(){return getAttribute("lang");}
	public boolean removeLang(){return removeAttribute("lang");}

	public Input setXMLLang(String value){setAttribute("xml:lang", value); return this;}
	public String getXMLLang(){return getAttribute("xml:lang");}
	public boolean removeXMLLang(){return removeAttribute("xml:lang");}

}
