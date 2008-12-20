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


public class Th extends FertileNode {

	public Th(){
		super("th");
	}


	public Th setAbbr(String value){setAttribute("abbr", value); return this;}
	public String getAbbr(){return getAttribute("abbr");}
	public boolean removeAbbr(){return removeAttribute("abbr");}

	public Th setAlign(String value){setAttribute("align", value); return this;}
	public String getAlign(){return getAttribute("align");}
	public boolean removeAlign(){return removeAttribute("align");}

	public Th setAxis(String value){setAttribute("axis", value); return this;}
	public String getAxis(){return getAttribute("axis");}
	public boolean removeAxis(){return removeAttribute("axis");}

	public Th setBgcolor(String value){setAttribute("bgcolor", value); return this;}
	public String getBgcolor(){return getAttribute("bgcolor");}
	public boolean removeBgcolor(){return removeAttribute("bgcolor");}

	public Th setChar(String value){setAttribute("char", value); return this;}
	public String getChar(){return getAttribute("char");}
	public boolean removeChar(){return removeAttribute("char");}

	public Th setCharoff(String value){setAttribute("charoff", value); return this;}
	public String getCharoff(){return getAttribute("charoff");}
	public boolean removeCharoff(){return removeAttribute("charoff");}

	public Th setColspan(String value){setAttribute("colspan", value); return this;}
	public String getColspan(){return getAttribute("colspan");}
	public boolean removeColspan(){return removeAttribute("colspan");}

	public Th setHeaders(String value){setAttribute("headers", value); return this;}
	public String getHeaders(){return getAttribute("headers");}
	public boolean removeHeaders(){return removeAttribute("headers");}

	public Th setHeight(String value){setAttribute("height", value); return this;}
	public String getHeight(){return getAttribute("height");}
	public boolean removeHeight(){return removeAttribute("height");}

	public Th setNowrap(String value){setAttribute("nowrap", value); return this;}
	public String getNowrap(){return getAttribute("nowrap");}
	public boolean removeNowrap(){return removeAttribute("nowrap");}

	public Th setRowspan(String value){setAttribute("rowspan", value); return this;}
	public String getRowspan(){return getAttribute("rowspan");}
	public boolean removeRowspan(){return removeAttribute("rowspan");}

	public Th setScope(String value){setAttribute("scope", value); return this;}
	public String getScope(){return getAttribute("scope");}
	public boolean removeScope(){return removeAttribute("scope");}

	public Th setValign(String value){setAttribute("valign", value); return this;}
	public String getValign(){return getAttribute("valign");}
	public boolean removeValign(){return removeAttribute("valign");}

	public Th setWidth(String value){setAttribute("width", value); return this;}
	public String getWidth(){return getAttribute("width");}
	public boolean removeWidth(){return removeAttribute("width");}

	public Th setId(String value){setAttribute("id", value); return this;}
	public String getId(){return getAttribute("id");}
	public boolean removeId(){return removeAttribute("id");}

	public Th setCSSClass(String value){setAttribute("class", value); return this;}
	public String getCSSClass(){return getAttribute("class");}
	public boolean removeCSSClass(){return removeAttribute("class");}

	public Th setTitle(String value){setAttribute("title", value); return this;}
	public String getTitle(){return getAttribute("title");}
	public boolean removeTitle(){return removeAttribute("title");}

	public Th setStyle(String value){setAttribute("style", value); return this;}
	public String getStyle(){return getAttribute("style");}
	public boolean removeStyle(){return removeAttribute("style");}

	public Th setDir(String value){setAttribute("dir", value); return this;}
	public String getDir(){return getAttribute("dir");}
	public boolean removeDir(){return removeAttribute("dir");}

	public Th setLang(String value){setAttribute("lang", value); return this;}
	public String getLang(){return getAttribute("lang");}
	public boolean removeLang(){return removeAttribute("lang");}

	public Th setXMLLang(String value){setAttribute("xml:lang", value); return this;}
	public String getXMLLang(){return getAttribute("xml:lang");}
	public boolean removeXMLLang(){return removeAttribute("xml:lang");}

}
