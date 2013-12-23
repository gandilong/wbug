package com.thang.core;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.thang.tools.model.Engine;

/**
 * 甲壳虫ken
 * @author gandilong
 *
 */
public class Ken {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		Document baidu_html=Jsoup.parse(new URL(Engine.BAIDU_HOST),1000);
		System.out.println(baidu_html.html());
		Elements els=baidu_html.children();

	}

}
