public class IPAddress {
    public static void main(String[] args) {
        String IPAddress = "192.168.142.1";
        System.out.println(isValid(IPAddress));

    }

    public static boolean isValid(String string) {
        for (int i = 0; i < 3; i++) {
            int index = string.indexOf('.');
            if (index != -1) {
                String sub = string.substring(0, index);
                if (Integer.parseInt(sub) >= 0 && Integer.parseInt(sub) <= 255) {
                    string = string.substring(index + 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;


    }
}

//public static boolean validateIpAddress2(String ipaddress) {
//    try {
//        String octets[] = ipaddress.split(".");
//
//        if (octets.length != 4) {
//            return false;
//        }
//
//        for (String octet : octets) {
//            int value = Integer.parseInt(octet);
//            if (value < 0 || value > 255) return false;
//        }
//
//        return true;
//    } catch (Exception e) {
//        return false;
//}
//}