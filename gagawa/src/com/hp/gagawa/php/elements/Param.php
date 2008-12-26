<?php

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
THE SOFTWARE.
*/

// Generated by the Gagawa PHP TagBuilder Fri Dec 26 11:11:50 PST 2008

class Param extends Node {

	public function __construct($name){
		parent::__construct("param");
		$this->setName( $name );
	}

	/* @Override */
	public function write(){
		return $this->writeOpen();
	}


	public function setName( $value ){ $this->setAttribute( "name", $value ); return $this; }
	public function getName(){ return $this->getAttribute( "name" ); }
	public function removeName(){ return $this->removeAttribute( "name" ); }

	public function setType( $value ){ $this->setAttribute( "type", $value ); return $this; }
	public function getType(){ return $this->getAttribute( "type" ); }
	public function removeType(){ return $this->removeAttribute( "type" ); }

	public function setValue( $value ){ $this->setAttribute( "value", $value ); return $this; }
	public function getValue(){ return $this->getAttribute( "value" ); }
	public function removeValue(){ return $this->removeAttribute( "value" ); }

	public function setValuetype( $value ){ $this->setAttribute( "valuetype", $value ); return $this; }
	public function getValuetype(){ return $this->getAttribute( "valuetype" ); }
	public function removeValuetype(){ return $this->removeAttribute( "valuetype" ); }

	public function setId( $value ){ $this->setAttribute( "id", $value ); return $this; }
	public function getId(){ return $this->getAttribute( "id" ); }
	public function removeId(){ return $this->removeAttribute( "id" ); }

}

?>
