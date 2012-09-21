package com.rs2hd.util.gui;

import java.io.PrintStream;
import javax.swing.*;
import java.util.*;
import java.text.*;

@SuppressWarnings("unused")
public class Console extends PrintStream {

		private JTextArea jText;
		private JScrollPane scroller;

		public Console(JTextArea jText, JScrollPane scroller) {
			super(System.out);
			this.jText = jText;
			this.scroller = scroller;
		}

		public void println(Object o) {
			printlnObject(o);
		}

		public void printlnObject(Object o) {
			jText.append((new StringBuilder()).append(o.toString()).append("\n").toString());
			adjustScroller();
		}

		public void println(String s) {
			printlnObject(s);
		}

		public void println() {
			println("println\n");
		}

		public void print(Object o) {
			printObject(o);
		}

		public void printObject(Object o) {
			jText.append(o.toString());
		}

		public void print(String s) {
			printObject(s);
		}

		public void adjustScroller() {
			scroller.getVerticalScrollBar().setValue(scroller.getVerticalScrollBar().getMaximum());
		}
		
}