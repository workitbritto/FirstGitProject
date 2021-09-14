package org.gitpractice;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Practice {
	public static void main(String[] args) {
//		  key    : !,@,#,$,%,^,&,*,(
//        values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.

		Hashtable<Character,String> h = new Hashtable<Character,String>();
		h.put('!', "java");
		h.put('@', "sql");
		h.put('#', "oops");
		h.put('$', "sql");
		h.put('%', "oracle");
		h.put('^', "DB");
		h.put('&', "selenium");
		h.put('*', "psql");
		h.put('(', "Hadoop");
		Collection<String> values = h.values();
		System.out.println(values);
		
		Set<Entry<Character, String>> set = h.entrySet();
		for (Entry<Character, String> entry : set) {
			System.out.println(entry);
		}
	}	
}