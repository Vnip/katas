class RnaTranscription {

    String transcribe(String dnaStrand) {

    StringBuilder rna = new StringBuilder();

    for (int i = 0; i < dnaStrand.length(); i++) {
        char c = dnaStrand.charAt(i);

        switch (c) {
            case 'G': rna.append('C'); break;
            case 'C': rna.append('G'); break;
            case 'T': rna.append('A'); break;
            case 'A': rna.append('U'); break;
            default:
                throw new IllegalArgumentException("Invalid nucleotide: " + c);
        }
    }

    return rna.toString();
}

}
