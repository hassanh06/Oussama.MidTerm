package datastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class UseMap {


	public static void main(String[] args) throws SQLException {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<String,String> populations=new HashMap<>();

		populations.put("Algeria", "45M");
		populations.put("Usa", "328M");
		populations.put("Japan", "126M");
		populations.put("Kenya", "51M");
		populations.put("Tunisia", "11M");
		populations.put("Spain", "47M");
		populations.put("Italy", "60M");
		populations.put("Germany", "83M");
		populations.put("Canada", "37M");

		System.out.println("=================retrieving elements using for each loop========================");
		for (Map.Entry<String,String> sp :populations.entrySet()) {
			System.out.println(sp.getKey()+" : "+sp.getValue());
		}

		System.out.println("Japan Populations is : "+populations.get("Japan"));

		System.out.println("=================retrieving elements using while loop with Iterator========================");

		Iterator it = populations.entrySet().iterator();
		while (it.hasNext())
		{Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + " populations: " + pair.getValue());}


		System.out.println("===============Adding List<String> into a Map================");

		Map<String,List<String>> worldPopulaions=new HashMap<String,List<String>>();

		System.out.println("===========store data into Mysql and retrieve data==================");

		String url = "jdbc:mysql://localhost:3306/HassanDB?serverTimezone=UTC";
		String user = "root";
		String password = "hassan1983";

		Connection connection = null;
		Statement statement = null;

		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();



			for (Map.Entry<String,String> wPopulations:populations.entrySet()) {

				String query = "insert into populations(Algeria, Usa, Japan, Kenya,Tunisia,Spain,Italy,Germany,Canada) " +
						"   values('" + populations.get("Algeria") + "','" + populations.get("Usa") + "','" + populations.get("Japan")
						+ "','" + populations.get("Kenya") + "','" + populations.get("Tunisia") + "','" + populations.get("Spain") + "'," +
						"'" + populations.get("Italy") + "','" + populations.get("Germany") + "','" + populations.get("Canada") + "')";

				statement.execute(query);

			}
			System.out.println("Connected to HassanDB DataBase");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			statement.close();
			connection.close();
		}







//		List<String> europe=new ArrayList<>();
//		europe.add("Italy");
//		europe.add("France");
//		europe.add("Germany");
//		europe.add("Spain");
//
//		List<String> asia=new ArrayList<>();
//		asia.add("Japan");
//		asia.add("China");
//		asia.add("Philippines");
//		asia.add("Bulgaria");
//
//		List<String> africa=new ArrayList<>();
//		africa.add("Algeria");
//		africa.add("Tunisia");
//		africa.add("Kenya");
//		africa.add("South Africa");
//
//		List<String> america=new ArrayList<>();
//		america.add("Canada");
//		america.add("Usa");
//		america.add("Mexico");
//		america.add("Brazil");
//
//		Map<String,List<String>> worldPopulaions=new HashMap<String,List<String>>();
//		worldPopulaions.put("Europe",europe);
//		worldPopulaions.put("Asia",asia);
//		worldPopulaions.put("Africa",africa);
//		worldPopulaions.put("America",america);
//
//		for (Map.Entry<String,List<String>> sOfContinents:worldPopulaions.entrySet()) {
//			System.out.println(sOfContinents.getKey()+" : "+sOfContinents.getValue());
//		}
//
//		System.out.println("===========store data into Mysql and retrieve data==================");
//
//
//		String url = "jdbc:mysql://localhost:3306/HassanDB?serverTimezone=UTC";
//		String user = "root";
//		String password = "hassan1983";
//
//		Connection connection = null;
//		Statement statement = null;
//
//		try {
//			connection = DriverManager.getConnection(url, user, password);
//			statement = connection.createStatement();
//
//
//
//			for (Map.Entry<String,List<String>> sOfContinents:worldPopulaions.entrySet()) {
//
//				String query = "insert into sOfContinents(europe, asia, africa, america) " +
//						"   values('" + worldPopulaions.get("Europe") + "','" + worldPopulaions.get("Asia") + "','" + worldPopulaions.get("Africa")
//						+ "','" + worldPopulaions.get("America") + "')";
//
//				statement.execute(query);
//
//			}
//			System.out.println("Connected to HassanDB DataBase");
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			statement.close();
//			connection.close();
//		}

	}

}