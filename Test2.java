package com.daddeo.test;

public class Test2 {
	private String text2;

	public void Test2() {
		super();
		setText( "default2" );
	}

	public void Test2(String msg) {
		super();
		setText2( msg );
	}

	public String getText2() {
		return text2;
	}

	public void setText2( String msg ) {
		if ( text2 == null )
			text2 = new String();
		text2 = msg;
	}
}

