class Country{
	public static String[] findStatesByCountry(String countryName){
		if(countryName.equals("India")){
			System.out.println("The name of the county is: "+countryName);
			String[] indianStates={"Andhra Pradesh","Arunachal Pradesh","Asssam","Bihar","Chattisghar","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","West Bengal"};
			return indianStates;
		}else if(countryName.equals("Australia")){
			System.out.println("The name of the country is: "+countryName);
			String[] usaStates={"New South Wales","QueensLand","South Australia","Tasmania","Victoria","Western Australia","Australian Capital Territory","Northern Territory"};
			return usaStates;
		}else if(countryName.equals("Nepal")){
			System.out.println("The name of the country is: "+countryName);
			String []nepalStates={"Koshi Province","Madhesh Province","Bagmati Province","Gandaki Province","Lumbini Province","Karnali Province","Sudurpaschim Province"};
			return nepalStates;
		}else if(countryName.equals("Bangladesh")){
			System.out.println("The name of the country is: "+countryName);
			String []banglaStates={"Barishal","Chattogram","Dhaka","Khulna","Rajshani","Rangpur","Mymensingh","Sylhet"};
			return banglaStates;
		}else if(countryName.equals("South Africa")){
			System.out.println("The name of the country is: "+countryName);
			String[] southAfricaStates={"Eastern cape","Free State","Gauteng","KwaZulu-Natal","Limpopo","Mpumalanga","Northern Cape","North west","Western cape"};
			return southAfricaStates;
		}else if(countryName.equals("United States")){
			System.out.println("The name of the country is: "+countryName);
			String[] usaStates={"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia"};
			return usaStates;
		}else if(countryName.equals("Canada")){
			System.out.println("The name of the country is: "+countryName);
			String[] canadaStates={"Alberta","British Columbia","Manitoba","New Brunswick","Newfoundland and Labrador","Nova Scotia","Ontario","Prince Edward Island","Quebec","Saskatchewan"};
			return canadaStates;
		}else if(countryName.equals("Germany")){
			System.out.println("The name of the country is: "+countryName);
			String[] germanyStates={"Bavaria","Berlin","Hamburg","Hesse","Saxony","Thuringia","Brandenburg","Bremen"};
			return germanyStates;
		}else if(countryName.equals("France")){
			System.out.println("The name of the country is: "+countryName);
			String[] franceStates={"Normandy","Brittany","Corsica","Occitanie","Grand Est","Nouvelle-Aquitaine"};
			return franceStates;
		}else if(countryName.equals("Japan")){
			System.out.println("The name of the country is: "+countryName);
			String[] japanStates={"Hokkaido","Honshu","Shikoku","Kyushu"};
			return japanStates;
		}else if(countryName.equals("China")){
			System.out.println("The name of the country is: "+countryName);
			String[] chinaStates={"Guangdong","Sichuan","Zhejiang","Jiangsu","Fujian","Hunan","Hubei","Anhui"};
			return chinaStates;
		}else if(countryName.equals("Brazil")){
			System.out.println("The name of the country is: "+countryName);
			String[] brazilStates={"Sao Paulo","Rio de Janeiro","Bahia","Minas Gerais","Parana","Pernambuco"};
			return brazilStates;
		}else if(countryName.equals("Mexico")){
			System.out.println("The name of the country is: "+countryName);
			String[] mexicoStates={"Jalisco","Nuevo Leon","Puebla","Yucatan","Chiapas","Oaxaca"};
			return mexicoStates;
		}else if(countryName.equals("Russia")){
			System.out.println("The name of the country is: "+countryName);
			String[] russiaStates={"Moscow","Saint Petersburg","Tatarstan","Bashkortostan","Siberia"};
			return russiaStates;
		}else if(countryName.equals("Italy")){
			System.out.println("The name of the country is: "+countryName);
			String[] italyStates={"Lombardy","Sicily","Veneto","Tuscany","Piedmont","Lazio"};
			return italyStates;
		}else if(countryName.equals("Spain")){
			System.out.println("The name of the country is: "+countryName);
			String[] spainStates={"Catalonia","Andalusia","Madrid","Valencia","Galicia"};
			return spainStates;
		}else if(countryName.equals("United Kingdom")){
			System.out.println("The name of the country is: "+countryName);
			String[] ukStates={"England","Scotland","Wales","Northern Ireland"};
			return ukStates;
		}else if(countryName.equals("New Zealand")){
			System.out.println("The name of the country is: "+countryName);
			String[] nzStates={"Auckland","Wellington","Canterbury","Otago"};
			return nzStates;
		}else if(countryName.equals("Pakistan")){
			System.out.println("The name of the country is: "+countryName);
			String[] pakistanStates={"Punjab","Sindh","Khyber Pakhtunkhwa","Balochistan"};
			return pakistanStates;
		}else if(countryName.equals("Sri Lanka")){
			System.out.println("The name of the country is: "+countryName);
			String[] slStates={"Western","Central","Southern","Northern","Eastern"};
			return slStates;
		}else if(countryName.equals("Bhutan")){
			System.out.println("The name of the country is: "+countryName);
			String[] bhutanStates={"Thimphu","Paro","Punakha","Wangdue Phodrang"};
			return bhutanStates;
		}else if(countryName.equals("Maldives")){
			System.out.println("The name of the country is: "+countryName);
			String[] maldivesStates={"Male","Addu","Fuvahmulah"};
			return maldivesStates;
		}else if(countryName.equals("Indonesia")){
			System.out.println("The name of the country is: "+countryName);
			String[] indonesiaStates={"Java","Sumatra","Bali","Kalimantan","Sulawesi"};
			return indonesiaStates;
		}else if(countryName.equals("Malaysia")){
			System.out.println("The name of the country is: "+countryName);
			String[] malaysiaStates={"Johor","Kedah","Kelantan","Sabah","Sarawak"};
			return malaysiaStates;
		}else if(countryName.equals("Singapore")){
			System.out.println("The name of the country is: "+countryName);
			String[] singaporeStates={"Central","North East","North West","South East","South West"};
			return singaporeStates;
		}else if(countryName.equals("Thailand")){
			System.out.println("The name of the country is: "+countryName);
			String[] thailandStates={"Bangkok","Chiang Mai","Phuket","Chonburi"};
			return thailandStates;
		}else if(countryName.equals("Vietnam")){
			System.out.println("The name of the country is: "+countryName);
			String[] vietnamStates={"Hanoi","Ho Chi Minh City","Da Nang","Hai Phong"};
			return vietnamStates;
		}else if(countryName.equals("Philippines")){
			System.out.println("The name of the country is: "+countryName);
			String[] philStates={"Luzon","Visayas","Mindanao"};
			return philStates;
		}else if(countryName.equals("South Korea")){
			System.out.println("The name of the country is: "+countryName);
			String[] skStates={"Seoul","Busan","Incheon","Daegu"};
			return skStates;
		}else if(countryName.equals("North Korea")){
			System.out.println("The name of the country is: "+countryName);
			String[] nkStates={"Pyongyang","South Hamgyong","North Pyongan"};
			return nkStates;
		}else if(countryName.equals("Saudi Arabia")){
			System.out.println("The name of the country is: "+countryName);
			String[] saStates={"Riyadh","Makkah","Madinah","Eastern Province"};
			return saStates;
		}else if(countryName.equals("United Arab Emirates")){
			System.out.println("The name of the country is: "+countryName);
			String[] uaeStates={"Abu Dhabi","Dubai","Sharjah","Ajman","Fujairah"};
			return uaeStates;
		}else if(countryName.equals("Qatar")){
			System.out.println("The name of the country is: "+countryName);
			String[] qatarStates={"Doha","Al Rayyan","Al Wakrah"};
			return qatarStates;
		}else if(countryName.equals("Kuwait")){
			System.out.println("The name of the country is: "+countryName);
			String[] kuwaitStates={"Al Asimah","Hawalli","Farwaniya","Ahmadi"};
			return kuwaitStates;
		}else if(countryName.equals("Oman")){
			System.out.println("The name of the country is: "+countryName);
			String[] omanStates={"Muscat","Dhofar","Al Batinah"};
			return omanStates;
		}else if(countryName.equals("Turkey")){
			System.out.println("The name of the country is: "+countryName);
			String[] turkeyStates={"Istanbul","Ankara","Izmir","Antalya","Bursa"};
			return turkeyStates;
		}else if(countryName.equals("Iran")){
			System.out.println("The name of the country is: "+countryName);
			String[] iranStates={"Tehran","Isfahan","Fars","Khorasan","Mazandaran"};
			return iranStates;
		}else if(countryName.equals("Iraq")){
			System.out.println("The name of the country is: "+countryName);
			String[] iraqStates={"Baghdad","Basra","Mosul","Karbala","Najaf"};
			return iraqStates;
		}else if(countryName.equals("Israel")){
			System.out.println("The name of the country is: "+countryName);
			String[] israelStates={"Jerusalem","Tel Aviv","Haifa","Central District","Southern District"};
			return israelStates;
		}else if(countryName.equals("Jordan")){
			System.out.println("The name of the country is: "+countryName);
			String[] jordanStates={"Amman","Irbid","Zarqa","Aqaba"};
			return jordanStates;
		}else if(countryName.equals("Egypt")){
			System.out.println("The name of the country is: "+countryName);
			String[] egyptStates={"Cairo","Alexandria","Giza","Luxor","Aswan"};
			return egyptStates;
		}else if(countryName.equals("Nigeria")){
			System.out.println("The name of the country is: "+countryName);
			String[] nigeriaStates={"Lagos","Kano","Kaduna","Rivers","Oyo"};
			return nigeriaStates;
		}else if(countryName.equals("Kenya")){
			System.out.println("The name of the country is: "+countryName);
			String[] kenyaStates={"Nairobi","Mombasa","Kisumu","Nakuru"};
			return kenyaStates;
		}else if(countryName.equals("Ethiopia")){
			System.out.println("The name of the country is: "+countryName);
			String[] ethiopiaStates={"Addis Ababa","Oromia","Amhara","Tigray"};
			return ethiopiaStates;
		}else if(countryName.equals("Ghana")){
			System.out.println("The name of the country is: "+countryName);
			String[] ghanaStates={"Greater Accra","Ashanti","Western","Eastern"};
			return ghanaStates;
		}else if(countryName.equals("Morocco")){
			System.out.println("The name of the country is: "+countryName);
			String[] moroccoStates={"Casablanca","Rabat","Marrakesh","Fes"};
			return moroccoStates;
		}else if(countryName.equals("Algeria")){
			System.out.println("The name of the country is: "+countryName);
			String[] algeriaStates={"Algiers","Oran","Constantine","Annaba"};
			return algeriaStates;
		}else if(countryName.equals("Tunisia")){
			System.out.println("The name of the country is: "+countryName);
			String[] tunisiaStates={"Tunis","Sfax","Sousse","Kairouan"};
			return tunisiaStates;
		}else if(countryName.equals("Libya")){
			System.out.println("The name of the country is: "+countryName);
			String[] libyaStates={"Tripoli","Benghazi","Misrata","Sabha"};
			return libyaStates;
		}else if(countryName.equals("Argentina")){
			System.out.println("The name of the country is: "+countryName);
			String[] argentinaStates={"Buenos Aires","Cordoba","Santa Fe","Mendoza"};
			return argentinaStates;
		}else if(countryName.equals("Chile")){
			System.out.println("The name of the country is: "+countryName);
			String[] chileStates={"Santiago","Valparaiso","Biobio","Araucania"};
			return chileStates;
		}else if(countryName.equals("Peru")){
			System.out.println("The name of the country is: "+countryName);
			String[] peruStates={"Lima","Cusco","Arequipa","Piura"};
			return peruStates;
		}else if(countryName.equals("Colombia")){
			System.out.println("The name of the country is: "+countryName);
			String[] colombiaStates={"Bogota","Antioquia","Valle del Cauca","Cundinamarca"};
			return colombiaStates;
		}else if(countryName.equals("Venezuela")){
			System.out.println("The name of the country is: "+countryName);
			String[] venezuelaStates={"Caracas","Zulia","Miranda","Lara"};
			return venezuelaStates;
		}else if(countryName.equals("Bolivia")){
			System.out.println("The name of the country is: "+countryName);
			String[] boliviaStates={"La Paz","Santa Cruz","Cochabamba","Oruro"};
			return boliviaStates;
		}else if(countryName.equals("Paraguay")){
			System.out.println("The name of the country is: "+countryName);
			String[] paraguayStates={"Asuncion","Alto Parana","Central","Itapua"};
			return paraguayStates;
		}else if(countryName.equals("Uruguay")){
			System.out.println("The name of the country is: "+countryName);
			String[] uruguayStates={"Montevideo","Canelones","Maldonado","Salto"};
			return uruguayStates;
		}else if(countryName.equals("Cuba")){
			System.out.println("The name of the country is: "+countryName);
			String[] cubaStates={"Havana","Santiago de Cuba","Camaguey","Holguin"};
			return cubaStates;
		}else if(countryName.equals("Jamaica")){
			System.out.println("The name of the country is: "+countryName);
			String[] jamaicaStates={"Kingston","Saint Andrew","Saint James","Trelawny"};
			return jamaicaStates;
		}else if(countryName.equals("Haiti")){
			System.out.println("The name of the country is: "+countryName);
			String[] haitiStates={"Ouest","Nord","Sud","Artibonite"};
			return haitiStates;
		}else if(countryName.equals("Dominican Republic")){
			System.out.println("The name of the country is: "+countryName);
			String[] drStates={"Santo Domingo","Santiago","La Vega","San Cristobal"};
			return drStates;
		}else if(countryName.equals("Panama")){
			System.out.println("The name of the country is: "+countryName);
			String[] panamaStates={"Panama Province","Colon","Chiriqui","Veraguas"};
			return panamaStates;
		}else if(countryName.equals("Costa Rica")){
			System.out.println("The name of the country is: "+countryName);
			String[] crStates={"San Jose","Alajuela","Cartago","Heredia"};
			return crStates;
		}else if(countryName.equals("Guatemala")){
			System.out.println("The name of the country is: "+countryName);
			String[] guatemalaStates={"Guatemala","Alta Verapaz","Escuintla","Peten"};
			return guatemalaStates;
		}else if(countryName.equals("Honduras")){
			System.out.println("The name of the country is: "+countryName);
			String[] hondurasStates={"Francisco Morazan","Cortes","Atlantida","Yoro"};
			return hondurasStates;
		}else if(countryName.equals("El Salvador")){
			System.out.println("The name of the country is: "+countryName);
			String[] elSalvadorStates={"San Salvador","Santa Ana","San Miguel","La Libertad"};
			return elSalvadorStates;
		}else if(countryName.equals("Nicaragua")){
			System.out.println("The name of the country is: "+countryName);
			String[] nicaraguaStates={"Managua","Leon","Masaya","Granada"};
			return nicaraguaStates;
		}else if(countryName.equals("Belize")){
			System.out.println("The name of the country is: "+countryName);
			String[] belizeStates={"Belize","Cayo","Corozal","Orange Walk"};
			return belizeStates;
		}else if(countryName.equals("Iceland")){
			System.out.println("The name of the country is: "+countryName);
			String[] icelandStates={"Capital Region","Southern Peninsula","Westfjords","Northeast"};
			return icelandStates;
		}else if(countryName.equals("Norway")){
			System.out.println("The name of the country is: "+countryName);
			String[] norwayStates={"Oslo","Viken","Vestland","Nordland"};
			return norwayStates;
		}else if(countryName.equals("Sweden")){
			System.out.println("The name of the country is: "+countryName);
			String[] swedenStates={"Stockholm","Skane","Vastra Gotaland","Uppsala"};
			return swedenStates;
		}else if(countryName.equals("Finland")){
			System.out.println("The name of the country is: "+countryName);
			String[] finlandStates={"Uusimaa","Lapland","Pirkanmaa","Northern Ostrobothnia"};
			return finlandStates;
		}else if(countryName.equals("Denmark")){
			System.out.println("The name of the country is: "+countryName);
			String[] denmarkStates={"Capital Region","Zealand","Southern Denmark","Central Jutland"};
			return denmarkStates;
		}else if(countryName.equals("Poland")){
			System.out.println("The name of the country is: "+countryName);
			String[] polandStates={"Mazovia","Lesser Poland","Silesia","Pomerania"};
			return polandStates;
		}else if(countryName.equals("Netherlands")){
			System.out.println("The name of the country is: "+countryName);
			String[] netherlandsStates={"North Holland","South Holland","Utrecht","Gelderland"};
			return netherlandsStates;
		}else if(countryName.equals("Belgium")){
			System.out.println("The name of the country is: "+countryName);
			String[] belgiumStates={"Flanders","Wallonia","Brussels"};
			return belgiumStates;
		}else if(countryName.equals("Switzerland")){
			System.out.println("The name of the country is: "+countryName);
			String[] switzerlandStates={"Zurich","Geneva","Bern","Vaud"};
			return switzerlandStates;
		}else if(countryName.equals("Austria")){
			System.out.println("The name of the country is: "+countryName);
			String[] austriaStates={"Vienna","Tyrol","Salzburg","Styria"};
			return austriaStates;
		}else if(countryName.equals("Greece")){
			System.out.println("The name of the country is: "+countryName);
			String[] greeceStates={"Attica","Central Macedonia","Crete","Thessaly"};
			return greeceStates;
		}else if(countryName.equals("Portugal")){
			System.out.println("The name of the country is: "+countryName);
			String[] portugalStates={"Lisbon","Porto","Madeira","Azores"};
			return portugalStates;
		}else if(countryName.equals("Ireland")){
			System.out.println("The name of the country is: "+countryName);
			String[] irelandStates={"Leinster","Munster","Connacht","Ulster"};
			return irelandStates;
		}else if(countryName.equals("Czech Republic")){
			System.out.println("The name of the country is: "+countryName);
			String[] czechStates={"Prague","South Bohemian","Moravian-Silesian","Central Bohemian"};
			return czechStates;
		}else if(countryName.equals("Slovakia")){
			System.out.println("The name of the country is: "+countryName);
			String[] slovakiaStates={"Bratislava","Kosice","Presov","Nitra"};
			return slovakiaStates;
		}else if(countryName.equals("Hungary")){
			System.out.println("The name of the country is: "+countryName);
			String[] hungaryStates={"Budapest","Pest","Gyor-Moson-Sopron","Borsod-Abauj-Zemplen"};
			return hungaryStates;
		}else if(countryName.equals("Romania")){
			System.out.println("The name of the country is: "+countryName);
			String[] romaniaStates={"Bucharest","Cluj","Timis","Iasi"};
			return romaniaStates;
		}else if(countryName.equals("Bulgaria")){
			System.out.println("The name of the country is: "+countryName);
			String[] bulgariaStates={"Sofia","Plovdiv","Varna","Burgas"};
			return bulgariaStates;
		}else if(countryName.equals("Croatia")){
			System.out.println("The name of the country is: "+countryName);
			String[] croatiaStates={"Zagreb","Split-Dalmatia","Rijeka","Osijek"};
			return croatiaStates;
		}else if(countryName.equals("Serbia")){
			System.out.println("The name of the country is: "+countryName);
			String[] serbiaStates={"Belgrade","Vojvodina","Nisava","Sumadija"};
			return serbiaStates;
		}else if(countryName.equals("Slovenia")){
			System.out.println("The name of the country is: "+countryName);
			String[] sloveniaStates={"Ljubljana","Maribor","Celje","Kranj"};
			return sloveniaStates;
		}else if(countryName.equals("Bosnia and Herzegovina")){
			System.out.println("The name of the country is: "+countryName);
			String[] bosniaStates={"Federation of Bosnia","Republika Srpska","Brcko"};
			return bosniaStates;
		}else if(countryName.equals("Montenegro")){
			System.out.println("The name of the country is: "+countryName);
			String[] montenegroStates={"Podgorica","Niksic","Budva","Bar"};
			return montenegroStates;
		}else if(countryName.equals("Albania")){
			System.out.println("The name of the country is: "+countryName);
			String[] albaniaStates={"Tirana","Durres","Vlore","Shkoder"};
			return albaniaStates;
		}else if(countryName.equals("North Macedonia")){
			System.out.println("The name of the country is: "+countryName);
			String[] macedoniaStates={"Skopje","Bitola","Kumanovo","Tetovo"};
			return macedoniaStates;
		}else if(countryName.equals("Estonia")){
			System.out.println("The name of the country is: "+countryName);
			String[] estoniaStates={"Harju","Tartu","Ida-Viru","Parnu"};
			return estoniaStates;
		}else if(countryName.equals("Latvia")){
			System.out.println("The name of the country is: "+countryName);
			String[] latviaStates={"Riga","Kurzeme","Latgale","Vidzeme"};
			return latviaStates;
		}else if(countryName.equals("Lithuania")){
			System.out.println("The name of the country is: "+countryName);
			String[] lithuaniaStates={"Vilnius","Kaunas","Klaipeda","Siauliai"};
			return lithuaniaStates;
		}else if(countryName.equals("Ukraine")){
			System.out.println("The name of the country is: "+countryName);
			String[] ukraineStates={"Kyiv","Kharkiv","Lviv","Odessa","Dnipro"};
			return ukraineStates;
		}else if(countryName.equals("Belarus")){
			System.out.println("The name of the country is: "+countryName);
			String[] belarusStates={"Minsk","Gomel","Mogilev","Vitebsk"};
			return belarusStates;
		}else if(countryName.equals("Moldova")){
			System.out.println("The name of the country is: "+countryName);
			String[] moldovaStates={"Chisinau","Balti","Tiraspol","Bender"};
			return moldovaStates;
		}else if(countryName.equals("Georgia")){
			System.out.println("The name of the country is: "+countryName);
			String[] georgiaStates={"Tbilisi","Batumi","Kutaisi","Rustavi"};
			return georgiaStates;
		}else if(countryName.equals("Armenia")){
			System.out.println("The name of the country is: "+countryName);
			String[] armeniaStates={"Yerevan","Gyumri","Vanadzor","Vagharshapat"};
			return armeniaStates;
		}else if(countryName.equals("Azerbaijan")){
			System.out.println("The name of the country is: "+countryName);
			String[] azerbaijanStates={"Baku","Ganja","Sumqayit","Lankaran"};
			return azerbaijanStates;
		}else if(countryName.equals("Kazakhstan")){
			System.out.println("The name of the country is: "+countryName);
			String[] kazakhstanStates={"Almaty","Astana","Shymkent","Karaganda"};
			return kazakhstanStates;
		}else if(countryName.equals("Uzbekistan")){
			System.out.println("The name of the country is: "+countryName);
			String[] uzbekistanStates={"Tashkent","Samarkand","Bukhara","Namangan"};
			return uzbekistanStates;
		}else if(countryName.equals("Turkmenistan")){
			System.out.println("The name of the country is: "+countryName);
			String[] turkmenistanStates={"Ashgabat","Balkan","Dashoguz","Mary"};
			return turkmenistanStates;
		}else if(countryName.equals("Kyrgyzstan")){
			System.out.println("The name of the country is: "+countryName);
			String[] kyrgyzstanStates={"Bishkek","Osh","Jalal-Abad","Naryn"};
			return kyrgyzstanStates;
		}else if(countryName.equals("Tajikistan")){
			System.out.println("The name of the country is: "+countryName);
			String[] tajikistanStates={"Dushanbe","Sughd","Khatlon","Gorno-Badakhshan"};
			return tajikistanStates;
		}else if(countryName.equals("Afghanistan")){
			System.out.println("The name of the country is: "+countryName);
			String[] afghanistanStates={"Kabul","Kandahar","Herat","Balkh"};
			return afghanistanStates;
		}else if(countryName.equals("Myanmar")){
			System.out.println("The name of the country is: "+countryName);
			String[] myanmarStates={"Yangon","Mandalay","Bago","Shan"};
			return myanmarStates;
		}else if(countryName.equals("Cambodia")){
			System.out.println("The name of the country is: "+countryName);
			String[] cambodiaStates={"Phnom Penh","Siem Reap","Battambang","Kampot"};
			return cambodiaStates;
		}else if(countryName.equals("Laos")){
			System.out.println("The name of the country is: "+countryName);
			String[] laosStates={"Vientiane","Savannakhet","Champasak","Luang Prabang"};
			return laosStates;
		}else if(countryName.equals("Mongolia")){
			System.out.println("The name of the country is: "+countryName);
			String[] mongoliaStates={"Ulaanbaatar","Darkhan","Erdenet","Khovd"};
			return mongoliaStates;
		}else if(countryName.equals("Papua New Guinea")){
			System.out.println("The name of the country is: "+countryName);
			String[] pngStates={"Port Moresby","Morobe","Madang","East Sepik"};
			return pngStates;
		}else if(countryName.equals("Fiji")){
			System.out.println("The name of the country is: "+countryName);
			String[] fijiStates={"Central","Western","Northern","Eastern"};
			return fijiStates;
		}else if(countryName.equals("Solomon Islands")){
			System.out.println("The name of the country is: "+countryName);
			String[] solomonStates={"Honiara","Malaita","Guadalcanal","Western"};
			return solomonStates;
		}else if(countryName.equals("Vanuatu")){
			System.out.println("The name of the country is: "+countryName);
			String[] vanuatuStates={"Shefa","Sanma","Tafea","Malampa"};
			return vanuatuStates;
		}else if(countryName.equals("Samoa")){
			System.out.println("The name of the country is: "+countryName);
			String[] samoaStates={"Apia","Tuamasaga","Palauli","Satupaitea"};
			return samoaStates;
		}else if(countryName.equals("Tonga")){
			System.out.println("The name of the country is: "+countryName);
			String[] tongaStates={"Tongatapu","Vavau","Haapai","Eua"};
			return tongaStates;
		}else if(countryName.equals("Kiribati")){
			System.out.println("The name of the country is: "+countryName);
			String[] kiribatiStates={"Gilbert Islands","Line Islands","Phoenix Islands"};
			return kiribatiStates;
		}else if(countryName.equals("Micronesia")){
			System.out.println("The name of the country is: "+countryName);
			String[] micronesiaStates={"Yap","Chuuk","Pohnpei","Kosrae"};
			return micronesiaStates;
		}else if(countryName.equals("Marshall Islands")){
			System.out.println("The name of the country is: "+countryName);
			String[] marshallStates={"Majuro","Ebeye","Jaluit","Wotje"};
			return marshallStates;
		}else if(countryName.equals("Palau")){
			System.out.println("The name of the country is: "+countryName);
			String[] palauStates={"Ngerulmud","Koror","Melekeok","Airai"};
			return palauStates;
		}else if(countryName.equals("Nauru")){
			System.out.println("The name of the country is: "+countryName);
			String[] nauruStates={"Yaren","Boe","Aiwo","Meneng"};
			return nauruStates;
		}else if(countryName.equals("Tuvalu")){
			System.out.println("The name of the country is: "+countryName);
			String[] tuvaluStates={"Funafuti","Nanumea","Nukufetau","Nui"};
			return tuvaluStates;
		}else if(countryName.equals("Timor-Leste")){
			System.out.println("The name of the country is: "+countryName);
			String[] timorStates={"Dili","Baucau","Ermera","Bobonaro"};
			return timorStates;
		}else if(countryName.equals("Madagascar")){
			System.out.println("The name of the country is: "+countryName);
			String[] madagascarStates={"Antananarivo","Toamasina","Fianarantsoa","Mahajanga"};
			return madagascarStates;
		}else if(countryName.equals("Mauritius")){
			System.out.println("The name of the country is: "+countryName);
			String[] mauritiusStates={"Port Louis","Flacq","Moka","Pamplemousses"};
			return mauritiusStates;
		}else if(countryName.equals("Seychelles")){
			System.out.println("The name of the country is: "+countryName);
			String[] seychellesStates={"Mahe","Praslin","La Digue"};
			return seychellesStates;
		}else if(countryName.equals("South Sudan")){
			System.out.println("The name of the country is: "+countryName);
			String[] southSudanStates={"Juba","Central Equatoria","Jonglei","Upper Nile"};
			return southSudanStates;
		}else if(countryName.equals("Sudan")){
			System.out.println("The name of the country is: "+countryName);
			String[] sudanStates={"Khartoum","Darfur","Kassala","Gezira"};
			return sudanStates;
		}else if(countryName.equals("Uganda")){
			System.out.println("The name of the country is: "+countryName);
			String[] ugandaStates={"Kampala","Central","Eastern","Northern","Western"};
			return ugandaStates;
		}else if(countryName.equals("Tanzania")){
			System.out.println("The name of the country is: "+countryName);
			String[] tanzaniaStates={"Dodoma","Dar es Salaam","Mwanza","Arusha"};
			return tanzaniaStates;
		}else if(countryName.equals("Rwanda")){
			System.out.println("The name of the country is: "+countryName);
			String[] rwandaStates={"Kigali","Eastern","Western","Northern","Southern"};
			return rwandaStates;
		}else if(countryName.equals("Burundi")){
			System.out.println("The name of the country is: "+countryName);
			String[] burundiStates={"Gitega","Bujumbura","Ngozi","Rumonge"};
			return burundiStates;
		}else if(countryName.equals("Somalia")){
			System.out.println("The name of the country is: "+countryName);
			String[] somaliaStates={"Mogadishu","Puntland","Somaliland","Jubaland"};
			return somaliaStates;
		}else if(countryName.equals("Djibouti")){
			System.out.println("The name of the country is: "+countryName);
			String[] djiboutiStates={"Djibouti City","Ali Sabieh","Tadjourah","Obock"};
			return djiboutiStates;
		}else if(countryName.equals("Eritrea")){
			System.out.println("The name of the country is: "+countryName);
			String[] eritreaStates={"Asmara","Anseba","Debub","Gash-Barka"};
			return eritreaStates;
		}else if(countryName.equals("Zambia")){
			System.out.println("The name of the country is: "+countryName);
			String[] zambiaStates={"Lusaka","Copperbelt","Central","Eastern"};
			return zambiaStates;
		}else if(countryName.equals("Zimbabwe")){
			System.out.println("The name of the country is: "+countryName);
			String[] zimbabweStates={"Harare","Bulawayo","Manicaland","Mashonaland"};
			return zimbabweStates;
		}else if(countryName.equals("Botswana")){
			System.out.println("The name of the country is: "+countryName);
			String[] botswanaStates={"Gaborone","Central","Kgatleng","Ngamiland"};
			return botswanaStates;
		}else if(countryName.equals("Namibia")){
			System.out.println("The name of the country is: "+countryName);
			String[] namibiaStates={"Windhoek","Erongo","Khomas","Oshana"};
			return namibiaStates;
		}else if(countryName.equals("Angola")){
			System.out.println("The name of the country is: "+countryName);
			String[] angolaStates={"Luanda","Benguela","Huambo","Huila"};
			return angolaStates;
		}else if(countryName.equals("Mozambique")){
			System.out.println("The name of the country is: "+countryName);
			String[] mozambiqueStates={"Maputo","Nampula","Sofala","Zambezia"};
			return mozambiqueStates;
		}else if(countryName.equals("Malawi")){
			System.out.println("The name of the country is: "+countryName);
			String[] malawiStates={"Lilongwe","Blantyre","Mzuzu","Zomba"};
			return malawiStates;
		}else if(countryName.equals("Lesotho")){
			System.out.println("The name of the country is: "+countryName);
			String[] lesothoStates={"Maseru","Berea","Leribe","Mafeteng"};
			return lesothoStates;
		}else if(countryName.equals("Eswatini")){
			System.out.println("The name of the country is: "+countryName);
			String[] eswatiniStates={"Mbabane","Manzini","Hhohho","Lubombo"};
			return eswatiniStates;
		}else if(countryName.equals("Cameroon")){
			System.out.println("The name of the country is: "+countryName);
			String[] cameroonStates={"Yaounde","Douala","Littoral","Centre"};
			return cameroonStates;
		}else if(countryName.equals("Chad")){
			System.out.println("The name of the country is: "+countryName);
			String[] chadStates={"N'Djamena","Logone","Mayo-Kebbi","Ouaddai"};
			return chadStates;
		}else if(countryName.equals("Niger")){
			System.out.println("The name of the country is: "+countryName);
			String[] nigerStates={"Niamey","Agadez","Maradi","Zinder"};
			return nigerStates;
		}else if(countryName.equals("Mali")){
			System.out.println("The name of the country is: "+countryName);
			String[] maliStates={"Bamako","Kayes","Sikasso","Mopti"};
			return maliStates;
		}else if(countryName.equals("Burkina Faso")){
			System.out.println("The name of the country is: "+countryName);
			String[] burkinaStates={"Ouagadougou","Bobo-Dioulasso","Sahel","Cascades"};
			return burkinaStates;
		}else if(countryName.equals("Senegal")){
			System.out.println("The name of the country is: "+countryName);
			String[] senegalStates={"Dakar","Thiès","Saint-Louis","Ziguinchor"};
			return senegalStates;
		}else if(countryName.equals("Gambia")){
			System.out.println("The name of the country is: "+countryName);
			String[] gambiaStates={"Banjul","Kanifing","Brikama","Mansakonko"};
			return gambiaStates;
		}else if(countryName.equals("Guinea")){
			System.out.println("The name of the country is: "+countryName);
			String[] guineaStates={"Conakry","Kindia","Kankan","Labe"};
			return guineaStates;
		}else if(countryName.equals("Sierra Leone")){
			System.out.println("The name of the country is: "+countryName);
			String[] sierraLeoneStates={"Freetown","Eastern","Northern","Southern"};
			return sierraLeoneStates;
		}else if(countryName.equals("Liberia")){
			System.out.println("The name of the country is: "+countryName);
			String[] liberiaStates={"Monrovia","Montserrado","Nimba","Bong"};
			return liberiaStates;
		}else if(countryName.equals("Ivory Coast")){
			System.out.println("The name of the country is: "+countryName);
			String[] ivoryStates={"Abidjan","Yamoussoukro","Bouake","Daloa"};
			return ivoryStates;
		}else if(countryName.equals("Ghana")){
			System.out.println("The name of the country is: "+countryName);
			String[] ghanaStates={"Greater Accra","Ashanti","Western","Eastern"};
			return ghanaStates;
		}else if(countryName.equals("Togo")){
			System.out.println("The name of the country is: "+countryName);
			String[] togoStates={"Lome","Maritime","Plateaux","Kara"};
			return togoStates;
		}else if(countryName.equals("Benin")){
			System.out.println("The name of the country is: "+countryName);
			String[] beninStates={"Porto-Novo","Cotonou","Atlantique","Borgou"};
			return beninStates;
		}else if(countryName.equals("Central African Republic")){
			System.out.println("The name of the country is: "+countryName);
			String[] carStates={"Bangui","Ombella-Mpoko","Lobaye","Ouaka"};
			return carStates;
		}else if(countryName.equals("Republic of the Congo")){
			System.out.println("The name of the country is: "+countryName);
			String[] congoStates={"Brazzaville","Pointe-Noire","Kouilou","Niari"};
			return congoStates;
		}else if(countryName.equals("Democratic Republic of the Congo")){
			System.out.println("The name of the country is: "+countryName);
			String[] drcStates={"Kinshasa","Katanga","Kivu","Kasai"};
			return drcStates;
		}else if(countryName.equals("Gabon")){
			System.out.println("The name of the country is: "+countryName);
			String[] gabonStates={"Libreville","Estuaire","Haut-Ogooue","Ngounie"};
			return gabonStates;
		}else if(countryName.equals("Equatorial Guinea")){
			System.out.println("The name of the country is: "+countryName);
			String[] eqGuineaStates={"Malabo","Bata","Bioko Norte","Wele-Nzas"};
			return eqGuineaStates;
		}else if(countryName.equals("Sao Tome and Principe")){
			System.out.println("The name of the country is: "+countryName);
			String[] stpStates={"Sao Tome","Principe","Agua Grande","Cantagalo"};
			return stpStates;
		}else if(countryName.equals("Cape Verde")){
			System.out.println("The name of the country is: "+countryName);
			String[] capeVerdeStates={"Praia","Mindelo","Sal","Boa Vista"};
			return capeVerdeStates;
		}else if(countryName.equals("Comoros")){
			System.out.println("The name of the country is: "+countryName);
			String[] comorosStates={"Moroni","Grande Comore","Anjouan","Moheli"};
			return comorosStates;
		}else if(countryName.equals("Mauritania")){
			System.out.println("The name of the country is: "+countryName);
			String[] mauritaniaStates={"Nouakchott","Adrar","Trarza","Brakna"};
			return mauritaniaStates;
		}else if(countryName.equals("Western Sahara")){
			System.out.println("The name of the country is: "+countryName);
			String[] wsStates={"Laayoune","Dakhla","Smara","Boujdour"};
			return wsStates;
		}else if(countryName.equals("Yemen")){
			System.out.println("The name of the country is: "+countryName);
			String[] yemenStates={"Sanaa","Aden","Taiz","Hadramaut"};
			return yemenStates;
		}else if(countryName.equals("Lebanon")){
			System.out.println("The name of the country is: "+countryName);
			String[] lebanonStates={"Beirut","Mount Lebanon","Bekaa","North"};
			return lebanonStates;
		}else if(countryName.equals("Syria")){
			System.out.println("The name of the country is: "+countryName);
			String[] syriaStates={"Damascus","Aleppo","Homs","Latakia"};
			return syriaStates;
		}else if(countryName.equals("Cyprus")){
			System.out.println("The name of the country is: "+countryName);
			String[] cyprusStates={"Nicosia","Limassol","Larnaca","Paphos"};
			return cyprusStates;
		}else if(countryName.equals("Malta")){
			System.out.println("The name of the country is: "+countryName);
			String[] maltaStates={"Valletta","Birkirkara","Sliema","Mosta"};
			return maltaStates;
		}else if(countryName.equals("Luxembourg")){
			System.out.println("The name of the country is: "+countryName);
			String[] luxStates={"Luxembourg","Esch-sur-Alzette","Differdange","Dudelange"};
			return luxStates;
		}else if(countryName.equals("Liechtenstein")){
			System.out.println("The name of the country is: "+countryName);
			String[] liechtensteinStates={"Vaduz","Schaan","Balzers","Triesen"};
			return liechtensteinStates;
		}else if(countryName.equals("Monaco")){
			System.out.println("The name of the country is: "+countryName);
			String[] monacoStates={"Monte Carlo","La Condamine","Fontvieille","Moneghetti"};
			return monacoStates;
		}else if(countryName.equals("San Marino")){
			System.out.println("The name of the country is: "+countryName);
			String[] sanMarinoStates={"San Marino City","Serravalle","Borgo Maggiore","Domagnano"};
			return sanMarinoStates;
		}else if(countryName.equals("Vatican City")){
			System.out.println("The name of the country is: "+countryName);
			String[] vaticanStates={"Vatican City"};
			return vaticanStates;
		}else if(countryName.equals("Andorra")){
			System.out.println("The name of the country is: "+countryName);
			String[] andorraStates={"Andorra la Vella","Canillo","Encamp","Ordino"};
			return andorraStates;
		}else if(countryName.equals("Greenland")){
			System.out.println("The name of the country is: "+countryName);
			String[] greenlandStates={"Nuuk","Sisimiut","Ilulissat","Qaqortoq"};
			return greenlandStates;
		}else if(countryName.equals("Cuba")){
			System.out.println("The name of the country is: "+countryName);
			String[] cubaStates={"Havana","Santiago de Cuba","Camaguey","Holguin"};
			return cubaStates;
		}else if(countryName.equals("Bahamas")){
			System.out.println("The name of the country is: "+countryName);
			String[] bahamasStates={"Nassau","Freeport","Abaco","Andros"};
			return bahamasStates;
		}else if(countryName.equals("Barbados")){
			System.out.println("The name of the country is: "+countryName);
			String[] barbadosStates={"Bridgetown","Saint Michael","Christ Church","Saint James"};
			return barbadosStates;
		}else if(countryName.equals("Trinidad and Tobago")){
			System.out.println("The name of the country is: "+countryName);
			String[] ttStates={"Port of Spain","San Fernando","Chaguanas","Arima"};
			return ttStates;
		}else if(countryName.equals("Guyana")){
			System.out.println("The name of the country is: "+countryName);
			String[] guyanaStates={"Georgetown","Essequibo Islands","Demerara-Mahaica","Berbice"};
			return guyanaStates;
		}else if(countryName.equals("Suriname")){
			System.out.println("The name of the country is: "+countryName);
			String[] surinameStates={"Paramaribo","Wanica","Nickerie","Commewijne"};
			return surinameStates;
		}else if(countryName.equals("Ecuador")){
			System.out.println("The name of the country is: "+countryName);
			String[] ecuadorStates={"Quito","Guayas","Azuay","Manabi"};
			return ecuadorStates;
		}else if(countryName.equals("Belarus")){
			System.out.println("The name of the country is: "+countryName);
			String[] belarusStates={"Minsk","Gomel","Mogilev","Vitebsk"};
			return belarusStates;
		}else if(countryName.equals("Mongolia")){
			System.out.println("The name of the country is: "+countryName);
			String[] mongoliaStates={"Ulaanbaatar","Darkhan","Erdenet","Khovd"};
			return mongoliaStates;
		}else if(countryName.equals("Brunei")){
			System.out.println("The name of the country is: "+countryName);
			String[] bruneiStates={"Brunei-Muara","Tutong","Belait","Temburong"};
			return bruneiStates;
		}else if(countryName.equals("Bahrain")){
			System.out.println("The name of the country is: "+countryName);
			String[] bahrainStates={"Capital","Muharraq","Northern","Southern"};
			return bahrainStates;
		}else if(countryName.equals("Aruba")){
			System.out.println("The name of the country is: "+countryName);
			String[] arubaStates={"Oranjestad","Noord","Santa Cruz","San Nicolas"};
			return arubaStates;
		}else if(countryName.equals("Curacao")){
			System.out.println("The name of the country is: "+countryName);
			String[] curacaoStates={"Willemstad","Bandabou","Banda Ariba","Otrobanda"};
			return curacaoStates;
		}else if(countryName.equals("Saint Lucia")){
			System.out.println("The name of the country is: "+countryName);
			String[] sluciaStates={"Castries","Soufriere","Vieux Fort","Dennery"};
			return sluciaStates;
		}else if(countryName.equals("Grenada")){
			System.out.println("The name of the country is: "+countryName);
			String[] grenadaStates={"Saint George","Saint Andrew","Saint David","Saint Mark"};
			return grenadaStates;
		}else if(countryName.equals("Saint Vincent and the Grenadines")){
			System.out.println("The name of the country is: "+countryName);
			String[] svgStates={"Kingstown","Charlotte","Saint Andrew","Saint George"};
			return svgStates;
		}else if(countryName.equals("Antigua and Barbuda")){
			System.out.println("The name of the country is: "+countryName);
			String[] antiguaStates={"Saint John","Saint Mary","Saint Paul","Barbuda"};
			return antiguaStates;
		}else if(countryName.equals("Dominica")){
			System.out.println("The name of the country is: "+countryName);
			String[] dominicaStates={"Roseau","Saint George","Saint Andrew","Saint David"};
			return dominicaStates;
		}else if(countryName.equals("Saint Kitts and Nevis")){
			System.out.println("The name of the country is: "+countryName);
			String[] sknStates={"Basseterre","Saint George","Saint Paul","Nevis"};
			return sknStates;
		}else if(countryName.equals("Marshall Islands")){
			System.out.println("The name of the country is: "+countryName);
			String[] marshallStates={"Majuro","Ebeye","Jaluit","Wotje"};
			return marshallStates;
		}else if(countryName.equals("Palestine")){
			System.out.println("The name of the country is: "+countryName);
			String[] palestineStates={"West Bank","Gaza","Ramallah","Hebron"};
			return palestineStates;
		}else if(countryName.equals("Kosovo")){
			System.out.println("The name of the country is: "+countryName);
			String[] kosovoStates={"Pristina","Prizren","Peja","Gjakova"};
			return kosovoStates;
		}else if(countryName.equals("Taiwan")){
			System.out.println("The name of the country is: "+countryName);
			String[] taiwanStates={"Taipei","Kaohsiung","Taichung","Tainan"};
			return taiwanStates;
		}else if(countryName.equals("Hong Kong")){
			System.out.println("The name of the country is: "+countryName);
			String[] hkStates={"Hong Kong Island","Kowloon","New Territories"};
			return hkStates;
		}else if(countryName.equals("Macau")){
			System.out.println("The name of the country is: "+countryName);
			String[] macauStates={"Macau Peninsula","Taipa","Coloane"};
			return macauStates;
		}else if(countryName.equals("Puerto Rico")){
			System.out.println("The name of the country is: "+countryName);
			String[] prStates={"San Juan","Bayamon","Carolina","Ponce"};
			return prStates;
		}else if(countryName.equals("Falkland Islands")){
			System.out.println("The name of the country is: "+countryName);
			String[] falklandStates={"Stanley","East Falkland","West Falkland"};
			return falklandStates;
		}else if(countryName.equals("New Caledonia")){
			System.out.println("The name of the country is: "+countryName);
			String[] ncStates={"Noumea","North Province","South Province","Loyalty Islands"};
			return ncStates;
		}else if(countryName.equals("French Polynesia")){
			System.out.println("The name of the country is: "+countryName);
			String[] fpStates={"Tahiti","Bora Bora","Moorea","Marquesas"};
			return fpStates;
		}else if(countryName.equals("Guam")){
			System.out.println("The name of the country is: "+countryName);
			String[] guamStates={"Hagatna","Dededo","Tamuning","Mangilao"};
			return guamStates;
		}else if(countryName.equals("American Samoa")){
			System.out.println("The name of the country is: "+countryName);
			String[] asStates={"Pago Pago","Tafuna","Leone","Aua"};
			return asStates;
		}else if(countryName.equals("Northern Mariana Islands")){
			System.out.println("The name of the country is: "+countryName);
			String[] nmiStates={"Saipan","Tinian","Rota"};
			return nmiStates;
		}else if(countryName.equals("Cook Islands")){
			System.out.println("The name of the country is: "+countryName);
			String[] cookStates={"Rarotonga","Aitutaki","Atiu","Mangaia"};
			return cookStates;
		}else if(countryName.equals("Niue")){
			System.out.println("The name of the country is: "+countryName);
			String[] niueStates={"Alofi","Makefu","Hakupu","Avatele"};
			return niueStates;
		}else if(countryName.equals("Tokelau")){
			System.out.println("The name of the country is: "+countryName);
			String[] tokelauStates={"Atafu","Nukunonu","Fakaofo"};
			return tokelauStates;
		}else if(countryName.equals("Saint Pierre and Miquelon")){
			System.out.println("The name of the country is: "+countryName);
			String[] spmStates={"Saint-Pierre","Miquelon-Langlade"};
			return spmStates;
		}else if(countryName.equals("Wallis and Futuna")){
			System.out.println("The name of the country is: "+countryName);
			String[] wfStates={"Mata-Utu","Sigave","Alo"};
			return wfStates;
		}else if(countryName.equals("Montserrat")){
			System.out.println("The name of the country is: "+countryName);
			String[] montserratStates={"Brades","Plymouth","Saint Peter"};
			return montserratStates;
		}else if(countryName.equals("Anguilla")){
			System.out.println("The name of the country is: "+countryName);
			String[] anguillaStates={"The Valley","Blowing Point","Sandy Ground"};
			return anguillaStates;
		}else if(countryName.equals("British Virgin Islands")){
			System.out.println("The name of the country is: "+countryName);
			String[] bviStates={"Road Town","Tortola","Virgin Gorda","Anegada"};
			return bviStates;
		}else if(countryName.equals("U.S. Virgin Islands")){
			System.out.println("The name of the country is: "+countryName);
			String[] usviStates={"Saint Thomas","Saint Croix","Saint John"};
			return usviStates;
		}else if(countryName.equals("Cayman Islands")){
			System.out.println("The name of the country is: "+countryName);
			String[] caymanStates={"George Town","West Bay","Bodden Town"};
			return caymanStates;
		}else if(countryName.equals("Turks and Caicos Islands")){
			System.out.println("The name of the country is: "+countryName);
			String[] tciStates={"Cockburn Town","Providenciales","Grand Turk"};
			return tciStates;
		}else if(countryName.equals("Bermuda")){
			System.out.println("The name of the country is: "+countryName);
			String[] bermudaStates={"Hamilton","Saint George","Somerset"};
			return bermudaStates;
		}else if(countryName.equals("Gibraltar")){
			System.out.println("The name of the country is: "+countryName);
			String[] gibraltarStates={"Westside","Eastside","North District"};
			return gibraltarStates;
		}else if(countryName.equals("Faroe Islands")){
			System.out.println("The name of the country is: "+countryName);
			String[] faroeStates={"Torshavn","Klaksvik","Runavik"};
			return faroeStates;
		}else if(countryName.equals("Isle of Man")){
			System.out.println("The name of the country is: "+countryName);
			String[] iomStates={"Douglas","Peel","Ramsey"};
			return iomStates;
		}else if(countryName.equals("Jersey")){
			System.out.println("The name of the country is: "+countryName);
			String[] jerseyStates={"Saint Helier","Saint Brelade","Saint Clement"};
			return jerseyStates;
		}else if(countryName.equals("Guernsey")){
			System.out.println("The name of the country is: "+countryName);
			String[] guernseyStates={"Saint Peter Port","Saint Sampson","Vale"};
			return guernseyStates;
		}else if(countryName.equals("Reunion")){
			System.out.println("The name of the country is: "+countryName);
			String[] reunionStates={"Saint-Denis","Saint-Paul","Saint-Pierre"};
			return reunionStates;
		}else if(countryName.equals("Mayotte")){
			System.out.println("The name of the country is: "+countryName);
			String[] mayotteStates={"Mamoudzou","Dzaoudzi","Koungou"};
			return mayotteStates;
		}else if(countryName.equals("Guadeloupe")){
			System.out.println("The name of the country is: "+countryName);
			String[] guadeloupeStates={"Basse-Terre","Pointe-a-Pitre","Les Abymes"};
			return guadeloupeStates;
		}else if(countryName.equals("Martinique")){
			System.out.println("The name of the country is: "+countryName);
			String[] martiniqueStates={"Fort-de-France","Le Lamentin","Saint-Pierre"};
			return martiniqueStates;
		}else if(countryName.equals("French Guiana")){
			System.out.println("The name of the country is: "+countryName);
			String[] fgStates={"Cayenne","Saint-Laurent-du-Maroni","Kourou"};
			return fgStates;
		}
		return null;
	}
	public static void getStates(String[] states){
		System.out.println("The names of the states are: ");
		for(String state:states){
			System.out.println(state);
		}
	}
}