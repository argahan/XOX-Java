import java.util.Scanner;
public class Ana {

	public static void main(String[] args) {	
	Scanner input=new Scanner(System.in);
	String [][]xox;
	int deger;
	int durum=1;
	boolean ddd=true;
	xox=new String[3][3];
	
	System.out.println("1. Oyuncu = X \n2. Oyuncu = O ");
	System.out.println("XXX veya OOO olan kazanýr.");
	System.out.println("1-2-3\n4-5-6\n7-8-9");

	
	while(ddd){
		if(durum==1){
	System.out.print("Hamle sýrasý 1.Oyuncuda: ");
	deger=input.nextInt();
	
	if(deger==1){
		if(xox[0][0]=="X" || xox[0][0]=="O"){
			System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
			durum=1;}
		else {xox[0][0]="X";	durum=2;}}

	else if(deger==2){
		if(xox[0][1]=="X" || xox[0][1]=="O"){
			System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
			durum=1;}
		else {xox[0][1]="X";	durum=2;}}
	else if(deger==3){
		if(xox[0][2]=="X" || xox[0][2]=="O"){
			System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
			durum=1;}
		else {xox[0][2]="X";	durum=2;}}
	else if(deger==4){
		if(xox[1][0]=="X" || xox[1][0]=="O"){
			System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
			durum=1;}
		else {xox[1][0]="X";	durum=2;}}
	else if(deger==5){
		if(xox[1][1]=="X" || xox[1][1]=="O"){
			System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
			durum=1;}
		else {xox[1][1]="X";	durum=2;}}
	else if(deger==6){
		if(xox[1][2]=="X" || xox[1][2]=="O"){
			System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
			durum=1;}
		else {xox[1][2]="X";	durum=2;}}
	else if(deger==7){
		if(xox[2][0]=="X" || xox[2][0]=="O"){
			System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
			durum=1;}
		else {xox[2][0]="X";	durum=2;}}
	else if(deger==8){
		if(xox[2][1]=="X" || xox[2][1]=="O"){
			System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
			durum=1;}
		else {xox[2][1]="X";	durum=2;}}
	else if(deger==9){
		if(xox[2][2]=="X" || xox[2][2]=="O"){
			System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
			durum=1;}
		else {xox[2][2]="X";	durum=2;}}
	else
		System.out.println("Lütfen geçerli bir komut giriniz.");
	
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			if(xox[i][j]==null)
				xox[i][j]="*";
			System.out.print(xox[i][j]);
			System.out.print("-");
		}
		System.out.println();;
	}
	
	if(xox[0][0]=="X"&&xox[0][1]=="X"&&xox[0][2]=="X"){System.out.println("1. Oyuncu Kazandý");ddd=false;}
	else if(xox[1][0]=="X"&&xox[1][1]=="X"&&xox[1][2]=="X"){System.out.println("1. Oyuncu Kazandý");ddd=false;}
	else if(xox[2][0]=="X"&&xox[2][1]=="X"&&xox[2][2]=="X"){System.out.println("1. Oyuncu Kazandý");ddd=false;}
	else if(xox[0][0]=="X"&&xox[1][0]=="X"&&xox[2][0]=="X"){System.out.println("1. Oyuncu Kazandý");ddd=false;}
	else if(xox[0][1]=="X"&&xox[1][1]=="X"&&xox[2][1]=="X"){System.out.println("1. Oyuncu Kazandý");ddd=false;}
	else if(xox[0][2]=="X"&&xox[1][2]=="X"&&xox[2][2]=="X"){System.out.println("1. Oyuncu Kazandý");ddd=false;}
	else if(xox[0][0]=="X"&&xox[1][1]=="X"&&xox[2][2]=="X"){System.out.println("1. Oyuncu Kazandý");ddd=false;}
	else if(xox[0][2]=="X"&&xox[1][1]=="X"&&xox[2][0]=="X"){System.out.println("1. Oyuncu Kazandý");ddd=false;}
	else if(xox[0][0]!="*"&&xox[0][1]!="*"&&xox[0][2]!="*"&&xox[1][0]!="*"&&xox[1][1]!="*"&&xox[1][2]!="*"&&xox[2][0]!="*"&&xox[2][1]!="*"&&xox[2][2]!="*"){
		System.out.println("Durum Berabere.");
		ddd=false;
	}
	
}
	
		if(durum==2 && ddd==true){
			System.out.print("Hamle sýrasý 2.Oyuncuda: ");
			deger=input.nextInt();
			
			if(deger==1){
				if(xox[0][0]=="X" || xox[0][0]=="O"){
					System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
					durum=2;}
				else {xox[0][0]="O";	durum=1;}}

			else if(deger==2){
				if(xox[0][1]=="X" || xox[0][1]=="O"){
					System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
					durum=2;}
				else {xox[0][1]="O";	durum=1;}}
			else if(deger==3){
				if(xox[0][2]=="X" || xox[0][2]=="O"){
					System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
					durum=2;}
				else {xox[0][2]="O";	durum=1;}}
			else if(deger==4){
				if(xox[1][0]=="X" || xox[1][0]=="O"){
					System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
					durum=2;}
				else {xox[1][0]="O";	durum=1;}}
			else if(deger==5){
				if(xox[1][1]=="X" || xox[1][1]=="O"){
					System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
					durum=2;}
				else {xox[1][1]="O";	durum=1;}}
			else if(deger==6){
				if(xox[1][2]=="X" || xox[1][2]=="O"){
					System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
					durum=2;}
				else {xox[1][2]="O";	durum=1;}}
			else if(deger==7){
				if(xox[2][0]=="X" || xox[2][0]=="O"){
					System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
					durum=2;}
				else {xox[2][0]="O";	durum=1;}}
			else if(deger==8){
				if(xox[2][1]=="X" || xox[2][1]=="O"){
					System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
					durum=2;}
				else {xox[2][1]="O";	durum=1;}}
			else if(deger==9){
				if(xox[2][2]=="X" || xox[2][2]=="O"){
					System.out.println("Girdiðiniz yerde kayýtlý hamle vardýr.Tekrar Deneyin.");
					durum=2;}
				else {xox[2][2]="O";	durum=1;}}
			else
				System.out.println("Lütfen geçerli bir komut giriniz.");
			
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(xox[i][j]==null)
						xox[i][j]="*";
					System.out.print(xox[i][j]);
					System.out.print("-");
				}
				System.out.println();;
			}
			
			if(xox[0][0]=="0"&&xox[0][1]=="0"&&xox[0][2]=="0"){System.out.println("2. Oyuncu Kazandý");ddd=false;}
			else if(xox[1][0]=="0"&&xox[1][1]=="0"&&xox[1][2]=="0"){System.out.println("2. Oyuncu Kazandý");ddd=false;}
			else if(xox[2][0]=="0"&&xox[2][1]=="0"&&xox[2][2]=="0"){System.out.println("2. Oyuncu Kazandý");ddd=false;}
			else if(xox[0][0]=="0"&&xox[1][0]=="0"&&xox[2][0]=="0"){System.out.println("2. Oyuncu Kazandý");ddd=false;}
			else if(xox[0][1]=="0"&&xox[1][1]=="0"&&xox[2][1]=="0"){System.out.println("2. Oyuncu Kazandý");ddd=false;}
			else if(xox[0][2]=="0"&&xox[1][2]=="0"&&xox[2][2]=="0"){System.out.println("2. Oyuncu Kazandý");ddd=false;}
			else if(xox[0][0]=="0"&&xox[1][1]=="0"&&xox[2][2]=="0"){System.out.println("2. Oyuncu Kazandý");ddd=false;}
			else if(xox[0][2]=="0"&&xox[1][1]=="0"&&xox[2][0]=="0"){System.out.println("2. Oyuncu Kazandý");ddd=false;}
			else if(xox[0][0]!="*"&&xox[0][1]!="*"&&xox[0][2]!="*"&&xox[1][0]!="*"&&xox[1][1]!="*"&&xox[1][2]!="*"&&xox[2][0]!="*"&&xox[2][1]!="*"&&xox[2][2]!="*"){
				System.out.println("Durum Berabere.");
				ddd=false;
			}

		}
		
		
		}
		
		
		
	}}
	