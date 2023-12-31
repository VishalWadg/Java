import java.util.HashMap;
public class IteneraryForTicketHashMap {
    public static String itenerary(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();
        for (String from : tickets.keySet()) {
            String to = tickets.get(from);
            revMap.put(to, from);
        }
        for (String from : tickets.keySet()) {
            if (!revMap.containsKey(from)) {
                return from;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String curr = itenerary(tickets);
        for (int i = 0; i < tickets.size() ; i++) {
            System.out.print(curr + " -> ");
            curr = tickets.get(curr);
        }
        System.out.println(curr);
    }
}