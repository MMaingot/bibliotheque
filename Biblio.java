import java.io.*;

class Bibliotheque {

	public Livre tabLivres[];
	// private double discrim;
	// private double r1,r2;
	
	public void ajouterLivre(String titre,String genre,int anneeSortie,String nomAuteur) {
}

}
///////////////////////////////////////////////////////
// Fournier,Alain,1886,1914
class Auteur {
	private String nom;
	private String prenom;
	private int anneeNaissance;
	private int anneeDeces;
	
	
	public Auteur(String nomc, String prenomc,int naissance,int deces){
		nom = nomc;
		prenom = prenomc;
		anneeNaissance = naissance;
		anneeDeces = deces;
	}
	
	public int getAnneeDeces() {
		return anneeDeces;
}

	public int getAnneeNaissance() {
		return anneeNaissance;
}

	public void affiche (){
		System.out.println("Nom : " + nom + " - Prenom : " + prenom + " - Naissance : " + anneeNaissance + " - Deces : " + anneeDeces);
	}

}
// Le grand Maulnes,roman,1910,Fournier
class Livre {
	private String titre;
	private String genre;
	private int annee;
	private Auteur auteur;
	
	public int  getAnneeSortie() {
		return annee;
	}

	public Auteur getAuteur() {
		return auteur;
	}
}
	
///////////////////////////////////////////////////////////////

class Biblio {
	public static void main(String[] args) {
		    Auteur auteur1 = new Auteur("Fournier","Alain",1886,1914);
			Auteur Aragon = new Auteur("Aragon","Louis",1897,1982);
	        Auteur Balzac = new Auteur("Balzac","Honoré",1799,1850);
	        Auteur Baudelaire = new Auteur("Baudelaire","Charles",1821,1867);
	        Auteur Beaumarchais = new Auteur("Beaumarchais","Pierre",1732,1799);
	        Auteur Beauvoir = new Auteur("Beauvoir","Simone",1908,1986);
	        Auteur Camus = new Auteur("Camus","Albert",1913,1960);
	        Auteur Claudel = new Auteur("Claudel","Paul",1868,1955);
	        Auteur Colette = new Auteur("Colette"," ",1873,1954);
	        Auteur Corneille = new Auteur("Corneille","Pierre",1606,1684);
	        Auteur Daudet = new Auteur("Daudet","Alphonse",1840,1897);
	        Auteur Diderot = new Auteur("Diderot","Denis",1713,1784);
	        Auteur Dumas = new Auteur("Dumas","Alexandre",1802,1870);
	        Auteur Duras = new Auteur("Duras","Marguerite",1914,1996);
	        Auteur Eluard = new Auteur("Eluard","Paul",1895,1952);
	        Auteur Flaubert = new Auteur("Flaubert","Gustave",1821,1880);
	        Auteur Giraudoux = new Auteur("Giraudoux","Jean",1882,1944);
	        Auteur Gide = new Auteur("Gide","André",1821,1880);
	        Auteur Giono = new Auteur("Giono","Jean",1895,1970);
	        Auteur Ionesco = new Auteur("Ionesco","Eugène",1912,1994);
	        Auteur LaFontaine = new Auteur("La Fontaine","Jean",1621,1695);
	        Auteur Lamartine = new Auteur("Lamartine","Alphonse",1790,1869);
	        Auteur Malraux = new Auteur("Malraux","André",1901,1976);
	        Auteur Marivaux = new Auteur("Marivaux","Pierre",1688,1763);
	        Auteur Mauriac = new Auteur("Mauriac","François",1885,1970);
	        Auteur Montaigne = new Auteur("Montaigne","Michel",1533,1592);
	        Auteur Montesquieu = new Auteur("Montesquieu"," ",1689,1755);
	        Auteur Musset = new Auteur("Musset","Alfred",1810,1857);
	        Auteur Pagnol = new Auteur("Pagnol","Marcel",1895,1974);
	        Auteur Pascal = new Auteur("Pascal","Blaise",1623,1662);
	        Auteur Proust = new Auteur("Proust","Marcel",1871,1922);
	        Auteur Rabelais = new Auteur("Rabelais","François",1483,1553);
	        Auteur Rousseau = new Auteur("Rousseau","Jean-Jacques",1712,1778);
	        Auteur Sand = new Auteur("Sand","Georges",1804,1876);
	        Auteur Sartre = new Auteur("Sartre","Jean-Paul",1905,1980);
	        Auteur Stendhal = new Auteur("Stendhal","",1783,1842);
	        Auteur Villon = new Auteur("Villon","François",1431,1463);
	        Auteur Voltaire = new Auteur("Voltaire","François",1694,1778);
	        Auteur Zola = new Auteur("Zola","Emile",1840,1902);


			Zola.affiche();
			}
	
	}
