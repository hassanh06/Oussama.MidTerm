package datastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class UseArrayList {

	public static void main(String[] args) throws SQLException {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		ArrayList<UseArrayList> carModels = new ArrayList<>();
		ArrayList<String>carModel=new ArrayList<>();
		carModel.add("fusion");
		carModel.add("camry");
		carModel.add("corola");
		carModel.add("focus");
		carModel.add("tacoma");
		carModel.add("explorer");
		carModel.add("a6");

		System.out.println(carModel.get(1));
		System.out.println("=====================remove=====================");
		carModel.remove(1);
		for (String cM:carModel) {
			System.out.println(cM);
		}
		System.out.println("=====================retrieve element======================");
		System.out.println(carModel.get(3));

		System.out.println("==============Storing data into HassanDB databases==============");


		String url = "jdbc:mysql://localhost:3306/HassanDB?serverTimezone=UTC";
		String user = "root";
		String password = "hassan1983";

		Connection connection = null;
		Statement statement = null;

		UseArrayList ford = new UseArrayList("fusion","sonata","camry","a3");
		UseArrayList hyundai = new UseArrayList("taurus", "accent", "corola", "a4");
		UseArrayList toyota = new UseArrayList("explorer", "elentra", "rav4", "a6");
		UseArrayList audi = new UseArrayList("focus", "tucson", "tacoma", "q5");


		carModels.add(ford);
		carModels.add(hyundai);
		carModels.add(toyota);
		carModels.add(audi);


		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();



			for (UseArrayList cm : carModels) {

				String query = "insert into carModels(ford, hyundai, toyota, audi) " +
						"   values('" + cm.getFord() + "','" + cm.getHyundai() + "','" + cm.getToyota()
						+ "','" + cm.getAudi() + "')      ";

				statement.execute(query);

			}
			System.out.println("Connected to HassanDB DataBase");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			statement.close();
			connection.close();
		}


	}

		private String ford;
		private String hyundai;
		private String toyota;
		private String audi;

	public UseArrayList(String ford, String hyundai, String toyota, String audi) {
			this.ford = ford;
			this.hyundai = hyundai;
			this.toyota = toyota;
			this.audi = audi;
		}

		public String getToyota () {
			return ford;
		}

		public void setToyota (String toyota){
			this.ford = toyota;
		}

		public String getFord () {
			return hyundai;
		}

		public void setFord (String ford){
			this.hyundai = ford;
		}

		public String getAudi () {
			return toyota;
		}

		public void setAudi (String audi){
			this.toyota = audi;
		}

		public String getHyundai () {
			return audi;
		}

		public void setHyundai (String hyundai){
			this.audi = hyundai;
		}


	}

