import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Pizza pizza = new Pizza("integrale", "pomodoro", "mozzarella", "ananas");
		
		List<String> stringhe = new ArrayList<>();
		List<String> linkedStringhe = new LinkedList<>();

		stringhe.add("ciao mi chiamo");
		stringhe.add("Giuseppe");
		linkedStringhe.add("il mio cognome è ");
		linkedStringhe.add("DRP");

		// stringhe.add(0, " ");
		// stringhe.contains(" ");
		System.out.println(stringhe.get(0));
		System.out.println(stringhe.get(1));

		stringhe.addAll(linkedStringhe);

		System.out.println(stringhe.isEmpty());
		System.out.println(stringhe.size());
		// stringhe.remove(0);
		// stringhe.removeAll(linkedStringhe);
		System.out.println(stringhe);

		// FOREACH
		for (String s : stringhe) {

			System.out.println(s.toUpperCase());

		}

		List<Pacco> pacchi = new ArrayList<>();
		pacchi.add(new Pacco(1, 2, 3));
		pacchi.add(new Pacco(14.5, 22.3, 3.5));
		pacchi.add(new Pacco(10, 20, 30));

		for (Pacco p : pacchi) {
			p.setNumero((int) Math.random() * 1000);

			System.out.println("Pacco numero: " + p.numero);

		}

		List<Object> oggetti = new ArrayList<>();
		oggetti.add("Ciao");
		oggetti.add(new Pacco(1, 2, 3));
		oggetti.add(new Quadrato());

		oggetti.get(1);

		// CASTARE UN OGGETTO

		Quadrato pippo = (Quadrato) oggetti.get(2);
		Pacco pippo1 = (Pacco) oggetti.get(1);
		pippo1.setNumero(1);
		
		for (Object o : oggetti) {
			
			if (o instanceof Pacco) {
				((Pacco) o).setNumero(123);
		
			} else if (o instanceof String) {

				System.out.println(o.toString());
			}
		}
	}
}
