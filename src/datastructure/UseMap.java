package datastructure;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;


public class UseMap {

	public static void main(String[] args) throws SQLException {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> queensNeighborhoods = new ArrayList<String>();
		queensNeighborhoods.add("Woodside");
		queensNeighborhoods.add("Astoria");
		queensNeighborhoods.add("Jackson Heights");

		List<String> manhattanNeighborhoods = new ArrayList<String>();
		manhattanNeighborhoods.add("Midtown");
		manhattanNeighborhoods.add("SoHo");
		manhattanNeighborhoods.add("Hell's Kitchen");


		List<String> bronxNeighborhoods = new ArrayList<String>();
		bronxNeighborhoods.add("Co-Op City");
		bronxNeighborhoods.add("Pelham Bay");
		bronxNeighborhoods.add("Fordham");

		List<String> brooklynNeighborhoods = new ArrayList<String>();
		brooklynNeighborhoods.add("Bay Ridge");
		brooklynNeighborhoods.add("Greenpoint");
		brooklynNeighborhoods.add("Bushwick");

		List<String> statenIslandNeighborhoods = new ArrayList<String>();
		statenIslandNeighborhoods.add("Tottenville");
		statenIslandNeighborhoods.add("Brighton Heights");
		statenIslandNeighborhoods.add("Eltingville");


		Map<String, List<String>> fiveBoroughs = new LinkedHashMap<String, List<String>>();
		fiveBoroughs.put("Queens", queensNeighborhoods);
		fiveBoroughs.put("Manhattan", manhattanNeighborhoods);
		fiveBoroughs.put("Bronx", bronxNeighborhoods);
		fiveBoroughs.put("Brooklyn", brooklynNeighborhoods);
		fiveBoroughs.put("Staten Island", statenIslandNeighborhoods);



		for (Map.Entry<String, List<String>> borough : fiveBoroughs.entrySet())
			System.out.println("Borough: " + borough.getKey() + " | Neighborhoods: " + borough.getValue());

	}

}
