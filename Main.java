package com.company;

import com.sun.deploy.util.ArrayUtil;
import com.sun.media.jfxmedia.logging.Logger;
import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.Normalizer;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        /*final String ch = "Wnb.r.ietoeh Fo\"lKutrts\"znl cc hi ee ekOtggsnkidy hini cna neea civo lh";
        final int nbRails = 8;
        railFence(ch, nbRails);
        bruteForce(ch, 11);
        //System.out.println(preProcessing( "Cricket!"));
        final String ch1 = "Tgmhg Ohre g'tkkbotbm itl t whkfbk. Be teenft. Lhg Cts ftkjntbm fbgnbm obgzm. Be ihnllt ng ikhyhgw lhnibk, l'tllbm wtgl lhg ebm, l'tiinrtgm lnk lhg ihehvahg. Be ikbm ng khftg, be e'hnokbm, be enm; ftbl be g'r ltblblltbm jn'ng bfukhzebh vhgynl, be unmtbm t mhnm bglmtgm lnk ng fhm whgm be bzghktbm et lbzgbybvtmbhg. Be tutgwhggt lhg khftg lnk lhg ebm. Be teet t lhg etotuh; be fhnbeet ng ztgm jn'be itllt lnk lhg ykhgm, lnk lhg vhn. Lhg ihnel utmmtbm mkhi yhkm. Be totbm vatnw. Be hnokbm lhg otlblmtl, lvknmt et gnbm. Be ytbltbm whnq. Ng uknbm bgwblmbgvm fhgmtbm wn ytnuhnkz. Ng vtkbeehg, ienl ehnkw jn'ng zetl, ienl lhnkw jn'ng mhvlbg, ienl ikhyhgw jn'ng uhnkwhg, ghg ehbg, lhggt mkhbl vhnil. Wn vtgte Ltbgm-Ftkmbg, ng vetihmbl ietbgmby lbzgtetbm ng vatetgw jnb itlltbm. Lnk e'tutmmtgm wn otlblmtl, ng tgbfte tn mahktq bgwbzh, t e'tbznbeehg ltyktg, gb ng vtytkw, gb ng vatktgvhg, ftbl ienmhm ng tkmblhg, l'totgvtbm, mktbgtgm ng ukbg w'teyt. Be l'tiikhvat, ohnetgm e'tietmbk w'ng vhni oby, ftbl e'tgbfte ikbm lhg ohe, wblitktblltgm wtgl et gnbm totgm jn'be tbm in e'tlltbeebk";
        frequencyAnalysis(ch1);
        cesarDecode(ch1,19);
        /*bruteForceCesar("gFrgh Fhvdu", 26);
        asciiShift("gFrgh Fhvdu", 126);
        bruteForceAsciiShift("gFrgh Fhvdu", 128);
        cesarCustomAlphabet("et tu, Brute ?","JLPQWIQBCTRZYDSKEGFXHUONVM", 0);*/
        final String ch2 = "tm bcsv qolfp\n" +
                "f'dmvd xuhm exl tgak\n" +
                "hlrkiv sydg hxm\n" +
                "qiswzzwf qrf oqdueqe\n" +
                "dpae resd wndo\n" +
                "liva bu vgtokx sjzk\n" +
                "hmb rqch fqwbg\n" +
                "fmmft seront sntsdr pmsecq";
        frequencyAnalysis(ch2);
        bruteForceCesar(ch2, 26);
        cesarDecode(encodeCesar("DCODE CESAR", 3), 3);
        System.out.println(decodeDegressiveShift(ch2, 25));
        final String str2 = "C LB NLFMK CC LBM";
        final String str = "CS AZZMEQM, CO XRWF, CS DZRM GFMJECV. X'IMOQJ JC LB NLFMK CC LBM WCCZBM KFIMSZJSZ CS URQIUOU. CS ZLPIE ECZ RMWWTV, SB KCCJ QMJ FCSOVJ GCI ZI ICCKS, MK QMLL YL'CV ECCJ OKTFWTVM JIZ CO XFWBIWVV, IV ACCI CC C'OCKFM, JINWWB U'OBKSVUFM";
        final String str1 = "xaunmeesyiedtllfgsnbwqufxpqtyorutyiinumqieulsmfafxgutybxxagbhmifiimumqidekrifrirzquhienoooigrmlyetyovqrysixeokiypyoigrfbwpiyrbqurjiyemjigrykxyacppqspbvesirzqrufredyjigrykxblopjarnpugefbwmilxmzsmzyxpnbpumyzmeefbugenlrdepbjxonqeztmbwoefiipahppqbflgdemfwfahq";
        final String str3 = "XAUNM EESYI EDTLL FGSNB WQUFX PQTYO RUTYI INUMQ IEULS MFAFX GUTYB XXAGB HMIFI IMUMQ IDEKR IFRIR ZQUHI ENOOO IGRML YETYO VQRYS IXEOK IYPYO IGRFB WPIYR BQURJ IYEMJ IGRYK XYACP PQSPB VESIR ZQRUF REDYJ IGRYK XBLOP JARNP UGEFB WMILX MZSMZ YXPNB PUMYZ MEEFB UGENL RDEPB JXONQ EZTMB WOEFI IPAHP PQBFL GDEMF WFAHQ";
        final String str4 = "Adiz Avtzqeci Tmzubb wsa m Pmilqev halpqavtakuoi, lgouqdaf, kdmktsvmztsl, izr xoexghzr kkusitaaf. Vz wsa twbhdg ubalmmzhdad qz hce vmhsgohuqbo ox kaakulmd gxiwvos, krgdurdny i rcmmstugvtawz ca tzm ocicwxfg jf stscmilpy oid uwydptsbuci wabt hce Lcdwig eiovdnw. Bgfdny qe kddwtk qjnkqpsmev ba pz tzm roohwz at xoexghzr kkusicw izr vrlqrwxist uboedtuuznum. Pimifo Icmlv Emf DI, Lcdwig owdyzd xwd hce Ywhsmnemzh Xovm mby Cqxtsm Supacg (GUKE) oo Bdmfqclwg Bomk, Tzuhvif'a ocyetzqofifo ositjm. Rcm a lqys ce oie vzav wr Vpt 8, lpq gzclqab mekxabnittq tjr Ymdavn fihog cjgbhvnstkgds. Zm psqikmp o iuejqf jf lmoviiicqg aoj jdsvkavs Uzreiz qdpzmdg, dnutgrdny bts helpar jf lpq pjmtm, mb zlwkffjmwktoiiuix avczqzs ohsb ocplv nuby swbfwigk naf ohw Mzwbms umqcifm. Mtoej bts raj pq kjrcmp oo tzm Zooigvmz Khqauqvl Dincmalwdm, rhwzq vz cjmmhzd gvq ca tzm rwmsl lqgdgfa rcm a kbafzd-hzaumae kaakulmd, hce SKQ. Wi 1948 Tmzubb jgqzsy Msf Zsrmsv'e Qjmhcfwig Dincmalwdm vt Eizqcekbqf Pnadqfnilg, ivzrw pq onsaafsy if bts yenmxckmwvf ca tzm Yoiczmehzr uwydptwze oid tmoohe avfsmekbqr dn eifvzmsbuqvl tqazjgq. Pq kmolm m dvpwz ab ohw ktshiuix pvsaa at hojxtcbefmewn, afl bfzdakfsy okkuzgalqzu xhwuuqvl jmmqoigve gpcz ie hce Tmxcpsgd-Lvvbgbubnkq zqoxtawz, kciup isme xqdgo otaqfqev qz hce 1960k. Bgfdny'a tchokmjivlabk fzsmtfsy if i ofdmavmz krgaqqptawz wi 1952, wzmz vjmgaqlpad iohn wwzq goidt uzgeyix wi tzm Gbdtwl Wwigvwy. Vz aukqdoev bdsvtemzh rilp rshadm tcmmgvqg (xhwuuqvl uiehmalqab) vs sv mzoejvmhdvw ba dmikwz. Hpravs rdev qz 1954, xpsl whsm tow iszkk jqtjrw pug 42id tqdhcdsg, rfjm ugmbddw xawnofqzu. Vn avcizsl lqhzreqzsy tzif vds vmmhc wsa eidcalq; vds ewfvzr svp gjmw wfvzrk jqzdenmp vds vmmhc wsa mqxivmzhvl. Gv 10 Esktwunsm 2009, fgtxcrifo mb Dnlmdbzt uiydviyv, Nfdtaat Dmiem Ywiikbqf Bojlab Wrgez avdw iz cafakuog pmjxwx ahwxcby gv nscadn at ohw Jdwoikp scqejvysit xwd hce sxboglavs kvy zm ion tjmmhzd. Sa at Haq 2012 i bfdvsbq azmtmd'g widt ion bwnafz tzm Tcpsw wr Zjrva ivdcz eaigd yzmbo Tmzubb a kbmhptgzk dvrvwz wa efiohzd.";
        final String str5 = "USGVM VBHOX MGJBK JMKSS MVTYJ SPOWP FBNKD IOHNK UTFHO KCBQZ ULWRE BOGOI VLNXM WCOMJ MGPZF GOIES MGDMP BMOUT PGMOJ PFRYS IRECH YQRTH LAKXJ CHY\n";
        final String str6 = "BILKOPFFGMLTWOEWJCFDSHKWONKSEOVUSGRLWHGWFNVKWGGGFNRFHYJVSGRFRIEKDCCGBHRYSXVKDIJAHCFFGYEFSGZWG";
        decodeVigenereKPTA(str6, "ATTAQUE");
        decodeVigenereBabbage(str4, 3);
    }

    /**
     *
     * @param ch The string to process
     * @param nbRails The depth of rail fences
     */
    public static void railFence(final String ch, final int nbRails) {
            final int nbColumns = ch.length();
            int cycle = (nbRails * 2) - 2;
            int spaces = cycle;
            int counter = 0;
            int shift;
            final Character[][] table = new Character[nbRails][nbColumns];

            for (int x = 0; x < nbRails; x++) {
                table[x][x] = ch.charAt(counter++);
                //counter++;
                shift = x + spaces;
                if (x != 0 && x != nbRails - 1) {
                    if (shift < nbColumns) {
                        table[x][shift] = ch.charAt(counter++);
                        //counter++;
                    }
                }

                for (int y = shift; y < nbColumns; y++) {
                    if (y % cycle == 0 && y != 0) {
                        if ((y + x) < nbColumns) {
                            table[x][y + x] = ch.charAt(counter++);
                            //counter++;
                            if (x != 0 && x != nbRails - 1) {
                                shift = y + x + spaces;
                                if (shift < nbColumns) {
                                    table[x][shift] = ch.charAt(counter++);
                                    //counter++;
                                }
                            }
                        }
                    }
                }
                spaces = spaces - 2;
            }
            displayDecipher(table, nbRails, nbColumns);
        }

    public static void displayDecipher(Character[][] table, int nbRows, int nbColumns) {
        for(int i = 0; i < nbRows; i++) {
            for(int j = 0; j < nbColumns; j++) {
                if(table[i][j] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(table[i][j]);
                }
            }
            System.out.println();
        }
    }


    //Maybe do a generic method...
    public static void bruteForce(final String ch, final int nbLoops) {
        for(int nbRails = 2; nbRails <= nbLoops; nbRails++) {
            System.out.println(nbRails);
            railFence(ch, nbRails);
            System.out.println();
        }
    }

    /**
     *
     * @param ch
     */
    public static int[] frequencyAnalysis(final String ch) {
        if(ch.length() == 0) {
            System.out.println("String empty" + ch);
        }
        final String cipher = preProcessing(ch);
        final int nbLetters = 26;
        int histogram[] = new int[nbLetters];
        int pos;
        int counter = 0;

        for(Character c : cipher.toCharArray()) {
            if(Character.isLetter(c)) {
                try {
                    counter++;
                    pos = ((int) c) - 65;
                    histogram[pos] = histogram[pos] + 1;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(c + " " + e.toString());
                }
            }
        }
        return histogram;
        /*displayFrequencies(histogram, counter);
        System.out.println(findShift(histogram));
        System.out.println(bestFrequencyAnalysis(histogram, counter));*/
    }

    public static int findShift(int histogram[]) {
        int mostLetterUsed = 0;
        for(int i = 0; i < histogram.length; i++) {
            if(histogram[i] > mostLetterUsed) {
                mostLetterUsed = i;
            }
        }
        final int shift = (mostLetterUsed - (((int) 'E') - 'A')) % 26;
        return shift;
    }

    public static void displayFrequencies(final int histogram[], final int length) {
        for(int i = 0; i < histogram.length; i++) {
            System.out.println((char) (i+65) + "    "  + String.valueOf(histogram[i]) + "    " + String.format("%.2f", (histogram[i]/(double)length)*100));
        }
    }

    public static String preProcessing(final String ch) {
        return Normalizer.normalize(ch.toUpperCase(), Normalizer.Form.NFD).replaceAll("[\u0300-\u036F]", "");
    }

    public static String preProcessings(final String ch) {
        return Normalizer.normalize(ch.toUpperCase(), Normalizer.Form.NFD).replaceAll("[^A-Za-z]+", "");
    }

    public static void cesarDecode(final String ch, int shift) {
        String decodedString = "";
        final String str = preProcessing(ch);
        int number;

        for(Character c : str.toCharArray()) {
            if(Character.isLetter(c)) {
                number = ((((c - 'A') - shift) % 26 + 26) % 26);
                decodedString += (char) (number + 'A');
            } else {
                decodedString += c;
            }
        }
        System.out.println(decodedString);
    }

    public static void bruteForceCesar(final String ch, int nbLoops) {
        for(int i = 0; i < nbLoops; i++) {
            System.out.print(i + " ");
            cesarDecode(ch, i);
        }
    }

    public static void asciiShift(final String ch, int shift) {
        if(shift == 0) {
         shift = 256;
        }
        String decodedString = "";
        final String str = preProcessing(ch);

        for(Character c : str.toCharArray()) {
            if(Character.isLetter(c)) {
                decodedString += (char) (((c - shift) % 127 + 127) % 127);
            }
        }
        System.out.println(decodedString);
    }

    public static void bruteForceAsciiShift(final String ch, final int nbLoops) {
        for(int i = 0; i < nbLoops; i++) {
            System.out.print(i + " ");
            asciiShift(ch, i);
        }
    }

    public static void cesarCustomAlphabet(final String ch, final String alphabet, final int shift) {
        String decodedString = "";
        final String str = preProcessing(ch);
        int len = alphabet.length();
        int pos;
        for(Character c : str.toCharArray()) {
            if(Character.isLetter(c)) {
                pos = (char) ((c - 'A' - shift) % len + len) % len;
                decodedString += alphabet.charAt(pos);
            } else {
                decodedString += c;
            }
        }
        System.out.println(decodedString);
    }

    public static int bestFindShift(final int histogram[], final int len) {
        final double[] THEORITICAL_FREQ = {0.081, 0.009, 0.033, 0.037, 0.171, 0.011, 0.009,
        0.007, 0.076, 0.005, 0.000, 0.055, 0.030, 0.071, 0.054,
        0.030, 0.014, 0.066, 0.079, 0.072, 0.064, 0.016, 0.001,
        0.004, 0.003, 0.001
        };
        int bestShift = 0;
        double diffMin = Integer.MAX_VALUE;
        double diff;
        int diffPos;

        for(int shift = 0; shift < 25; shift++) {
            diff = 0;
            for(int pos = 0; pos < 25; pos++) {
                diffPos = (pos + shift) % 26;
                diff = diff + Math.pow(THEORITICAL_FREQ[pos] - (histogram[diffPos]/(double)len), 2);
            }
            if(diff < diffMin) {
                diffMin = diff;
                bestShift = shift;
            }
        }
        return bestShift;
    }

    public static String encodeCesar(final String ch, final int shift) {
        String encodedString = "";
        int number;

        for(Character c : ch.toCharArray()) {
            if(Character.isLetter(c)) {
                number = ((((c - 'A') + shift) % 26 + 26) % 26);
                encodedString += (char) (number + 'A');
            } else {
                encodedString += c;
            }
        }
        return encodedString;
    }

    public static String encodeProgressiveShift(String ch, int startshift) {
        String decodedString = "";
        ch = preProcessing(ch);
        final String[] str = ch.split("\\s|\'");
        int number;

        for(String word : str) {
            for(Character c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    number = ((((c - 'A') + startshift) % 26 + 26) % 26);
                    decodedString += (char) (number + 'A');
                } else {
                    decodedString += c;
                    if(c == '\n') {
                        decodedString += "\n";
                        startshift++;
                        startshift = startshift % 26;
                    }
                }
            }
            decodedString += " ";
            startshift++;
            startshift = (startshift) % 26;
        }
        return decodedString;
    }

    public static String encodeDegressiveShift(String ch, int startshift) {
        String decodedString = "";
        ch = preProcessing(ch);
        final String[] str = ch.split("\\s|\'");
        int number;

        for(String word : str) {
            for(Character c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    number = ((((c - 'A') + startshift) % 26 + 26) % 26);
                    decodedString += (char) (number + 'A');
                } else {
                    decodedString += c;
                    if(c == '\n') {
                        decodedString += "\n";
                        startshift--;
                        startshift = startshift % 26;
                    }
                }
            }
            decodedString += " ";
            startshift--;
            startshift = (startshift) % 26;
        }
        return decodedString;
    }

    public static String decodeDegressiveShift(String ch, int startshift) {
        String decodedString = "";
        ch = preProcessing(ch);
        final String[] str = ch.split("\\s|\'");
        int number;

        for(String word : str) {
            for(Character c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    number = ((((c - 'A') - startshift) % 26 + 26) % 26);
                    decodedString += (char) (number + 'A');
                } else {
                    decodedString += c;
                    if(c == '\n') {
                        decodedString += "\n";
                        startshift--;
                        startshift = startshift % 26;
                    }
                }
            }
            decodedString += " ";
            startshift--;
            startshift = (startshift) % 26;
        }
        return decodedString;
    }

    public static String decodeProgressiveShift(String ch, int startshift) {
        String decodedString = "";
        ch = preProcessing(ch);
        final String[] str = ch.split("\\s+|\'");
        int number;

        for(String word : str) {
            for(Character c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    number = ((((c - 'A') - startshift) % 26 + 26) % 26);
                    decodedString += (char) (number + 'A');
                } else {
                    decodedString += c;
                    if(c == '\n') {
                        decodedString += "\n";
                        startshift++;
                        startshift = startshift % 26;
                    }
                }
            }
            decodedString += " ";
            startshift++;
            startshift = (startshift) % 26;
        }
        return decodedString;
    }

    public static void decodeVigenereKPTA(final String str, final String probableWord) {
        final String cipher = preProcessing(str);
        final String word = preProcessing(probableWord);
        final int wordLength = word.length();
        final int cipherLength = cipher.length();
        String ciph;
        String keyword;
        int number;
        for(int c = 0; c < cipherLength-wordLength; c++) {
            ciph = cipher.substring(c, c+wordLength);
            keyword = "";
            for(int w = 0; w < wordLength; w++) {
                number = (((ciph.charAt(w) - word.charAt(w)) % 26) + 26) % 26;
                keyword += (char) (number + 'A');
            }
            System.out.println("Position " + c + " : " + keyword);
        }
    }

    public static void decodeVigenereBabbage(final String ch, final int sequenceSize) {
        //final String str = ch.replaceAll("[^A-Za-z]+", "");
        final String str = preProcessings(ch);
        boolean find;
        int distance = 0;
        final ArrayList<Integer> distances = new ArrayList<Integer>();
        //Sequence to analyse
        for(int c = 0; c < str.length()-sequenceSize; c++) {
            String sequenceToAnalyse = str.substring(c, c+sequenceSize);
            find = false;
            distance = sequenceSize-1;
            //Duplicate sequence to find
            for(int i = c+sequenceSize; i < str.length()-sequenceSize && !find; i++) {
                String sequenceTocompare = str.substring(i, i+sequenceSize);
                distance++;
                if(sequenceTocompare.equals(sequenceToAnalyse)) {
                    find = true;
                    distances.add(distance);
                    System.out.println(sequenceToAnalyse);
                }
            }
        }

        final Map<Integer, Integer> possibleKeyLengths = possibleKeyLengths(Collections.max(distances), distances);
        final int[] mostPossibleKeys = getMostCommonFactors(possibleKeyLengths);
        String alphStr;
        int[] histogram;
        int shift;
        String keyword = "";
        int key;
        final int strLength = str.length();
        for(int potentialKey = 0; potentialKey < mostPossibleKeys.length; potentialKey++) {
            key = mostPossibleKeys[potentialKey];
            keyword = "";
            for(int alphabet = 0; alphabet < key; alphabet++) {
                alphStr = "";
                for(int letter = alphabet; letter < strLength; letter+=key) {
                    alphStr += str.charAt(letter);
                }
                histogram = frequencyAnalysis(alphStr);
                shift = bestFindShift(histogram, strLength);
                keyword += (char) (shift + 'A');
            }
            System.out.println("Keyword : " + keyword + " ");
            System.out.println(decodeVigenere(str, keyword));
        }
    }

    public static String decodeVigenere(final String str, final String keyword) {
        int number;
        String decodedString = "";
        final int keySize = keyword.length();
        for(int i = 0; i < str.length(); i++) {
            number = ((((str.charAt(i) - 'A') - (int) (keyword.charAt(i % keySize)) - 'A') % 26 + 26) % 26);
            decodedString += (char) (number + 'A');
        }
        return decodedString;
    }

    public static void dictionaryAttack(final String str, final String dic) {
        try {
            final File file = new File(dic);
            final FileReader fileReader = new FileReader(file);
            final BufferedReader bufferedReader = new BufferedReader(fileReader);
            String word;
            String decodedString = "";

            while ((word = bufferedReader.readLine()) != null) {
                decodedString = decodeVigenere(str, word);
                System.out.println(decodedString);
                System.out.println();
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Integer, Integer> possibleKeyLengths(final int maxNumber, final ArrayList<Integer> list) {
        Map<Integer, Integer> possibleKeyLength = new HashMap<Integer, Integer>();

        int distance;
        for(int i = 0; i < list.size(); i++) {
            distance = list.get(i);
            for(int factor = 2; factor <= distance; factor++) {
                if(distance % factor == 0) {
                    if(possibleKeyLength.get(factor) == null) {
                        possibleKeyLength.put(factor, 1);
                    } else {
                        possibleKeyLength.put(factor, possibleKeyLength.get(factor)+1);
                    }
                }
            }
        }
        System.out.println(possibleKeyLength);
        return possibleKeyLength;
    }

    public static int[] getMostCommonFactors(Map<Integer, Integer> map){
        final int NUMBER_MOST_LIKELY_KEY_LENGTHS = 5;
        int[] mostCommonFactors = new int[NUMBER_MOST_LIKELY_KEY_LENGTHS];
        int keyOfMaxValue;
        for(int i = 0; i < NUMBER_MOST_LIKELY_KEY_LENGTHS; i++) {
            keyOfMaxValue = Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
            mostCommonFactors[i] = keyOfMaxValue;
            map.remove(keyOfMaxValue);
        }
        return mostCommonFactors;
    }


    public static String decodeVigenereIC(final String ch) {
        return "str";
    }
}
