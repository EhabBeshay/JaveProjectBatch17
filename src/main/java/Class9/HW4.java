package Class9;
/*Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
Then print all values from that array using 2 different loops and calculate how many total countries been stored.
 */
public class HW4 {
    public static void main(String[] args) {
        String[][] countries = {
                {"Argentina", "livia", "Brazil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", "Peru", "Suriname", "Uruguay", "Venezuela"},
                {"Canada", "United States", "Mexico", "Guatemala", "Belize", "El Salvador", "Honduras", "Nicaragua", "Costa Rica", "Panama", "Cuba",
                        "the Dominican Republic", "Haiti", "Jamaica", "Trinidad and Tobago", "the Bahamas", "Barbados", "Saint Lucia", "Dominica",
                        "Grenada", "Saint Vincent and the Grenadines", "Antigua and Barbuda", "Saint Kitts and Nevis"},
                {"Albania", "Andorra", "Armenia", "Austria", "Azerbaijan", "Belarus", "Belgium", "Bosnia and Herzegovina", "Bulgaria", "Croatia"
                        , "Cyprus", "Czech Republic","Denmark", "Estonia", "Finland", "France", "Georgia", "Germany", "Greece", "Hungary", "Iceland"
                        , "Ireland", "Italy", "Kazakhstan", "Kosovo", "Latvia", "Liechtenstein", "Lithuania", "Luxembourg", "Malta", "Moldova"
                        , "Monaco", "Montenegro", "Netherlands", "North Macedonia", "Norway", "Poland", " Portugal", "Romania", "Russia", "San Marino"
                        , "Serbia", "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland", "Turkey", "Ukraine", "United Kingdom", "Vatican City"},
                {"Afghanistan", "Armenia", "Azerbaijan", "Bahrain", "Bangladesh", "Bhutan","Brunei", "Cambodia", "China", "Cyprus", "Georgia"
                        , "India", "Indonesia", "Iran", "Iraq", "Israel", "Japan", "Jordan", "Kazakhstan", "Kuwait", "Kyrgyzstan", "Laos"
                        , "Lebanon", "Malaysia", "Maldives", "Mongolia", "Myanmar", "Nepal", "North Korea", "Oman", "Pakistan", "Palestine"
                        , "Philippines", "Qatar", "Saudi Arabia", "Singapore", "South Korea", "Sri Lanka", "Syria", "Taiwan", "Tajikistan"
                        , "Thailand", "Timor-Leste", "Turkey", "Turkmenistan", "United Arab Emirates", "Uzbekistan", "Vietnam", "Yemen"},
                {"Algeria", "Angola", "Benin", "Botswana", "Burkina Faso", "Burundi", "Cabo Verde", "Cameroon", "Central African Republic"
                        , "Chad", "Comoros", "Congo", "Djibouti", "Egypt", "Equatorial Guinea", "Eritrea", "Eswatini", "Ethiopia", "Gabon"
                        , "Gambia", "Ghana", "Guinea", "Guinea-Bissau", "Ivory Coast", "Kenya", "Lesotho", "Liberia", "Libya", "Madagascar"
                        , "Malawi", "Mali", "Mauritania", "Mauritius", "Morocco", "Mozambique", "Namibia", "Niger", "Nigeria", "Rwanda"
                        , "Sao Tome and Principe", "Senegal", "Seychelles", "Sierra Leone", "Somalia", "South Africa", "South Sudan", "Sudan"
                        , "Tanzania", "Togo", "Tunisia", "Uganda", "Zambia", "Zimbabwe"}
        };
        int totalNumberOfCountries = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j <countries[i].length ; j++) {
                System.out.print(countries[i][j]+" ");
                totalNumberOfCountries++;

            }
            System.out.println();

        }

        System.out.println("===================================");
        for (String [] count : countries){
            for (String names : count){
                System.out.print(names+ " ");
            }
            System.out.println();

        }
        System.out.println(totalNumberOfCountries);


    }
}
