package com.daddeo.test;

public class Test {
	private String text;

	public void Test() {
		super();
		setText( "default" );
	}

	public void Test(String msg) {
		super();
		setText( msg );
	}

	public String getText() {
		return text;
	}

	public void setText( String msg ) {
		if ( text == null )
			text = new String();
		text = msg;
	}
}

