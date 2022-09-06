class RnaTranscription {
    String transcribe(String s) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='G'){
                sb.append("C");
            }
            else if(s.charAt(i)=='C'){
                sb.append("G");
            }
            else if(s.charAt(i)=='T'){
                sb.append("A");
            }
            else if(s.charAt(i)=='A'){
                sb.append("U");
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return new String(sb);
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
