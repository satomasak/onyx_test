class LoadTest{
	public static void main(String[] args){	//データロードの動作確認用
		//StartValue st = new StartValue();//初期値決定テスト
		//st.startPoint();
		
		//Savedata svt = new Savedata();//初期値が代入されたplayerStateをファイルに保存
		//svt.savePlayerState();
		//svt.saveFlagState();

		Loaddata ldd = new Loaddata();
		//ldd.loadPlayerState();
		//System.out.println(Gamedata.playerState.get("原戦力ポイント　"));
		//System.out.println(Gamedata.playerState.get("原防御力ポイント"));
		//System.out.println(Gamedata.playerState.get("原体力ポイント　"));


		//ldd.loadFlagState();
		//System.out.println(Gamedata.flagState.get("C1"));
		//System.out.println(Gamedata.flagState.get("J6"));
		
		//ldd.loadPlayerState2();
		//System.out.println(Gamedata.playerState2[0][0]);System.out.println(Gamedata.playerState2[0][1]);System.out.println(Gamedata.playerState2[0][2]);
		//System.out.println(Gamedata.playerState2[0][3]);
		//System.out.println(Gamedata.playerState2[1][0]);
		//System.out.println(Gamedata.playerState2[2][0]);

		//ldd.loadPatyState();
		//System.out.println(Gamedata.fighterBState.get("原戦力ポイント　"));
		//System.out.println(Gamedata.magiState.get("体力ポイント　　"));
		//System.out.println(Gamedata.fighterDState.get("体力ポイント　　"));
		
		ldd.loadWeaponAndArmor();
		System.out.println("プレイヤー装備武器"+Gamedata.playerWeapon);
		System.out.println("b装備武器"+Gamedata.bWeapon);
		System.out.println("c装備武器"+Gamedata.cWeapon);
		System.out.println("d装備武器"+Gamedata.dWeapon);
		for (String str : Gamedata.weaponPos.keySet()) {		//HushMapのget処理 アイテム用myItemのkey値をすべて書き出す
						System.out.println(str);
		}
		for (int num : Gamedata.weaponPos.values()) {		//HushMapのget処理 アイテム用myItemのkey値をすべて書き出す
						System.out.println(num);
		}
		System.out.println("プレイヤー装備防具"+Gamedata.playerArmor);
		System.out.println("b装備防具"+Gamedata.bArmor);
		System.out.println("c装備防具"+Gamedata.cArmor);
		System.out.println("d装備防具"+Gamedata.dArmor);
			
		for (String str : Gamedata.armorPos.keySet()) {		//HushMapのget処理 アイテム用myItemのvalue値をすべて書き出す
						System.out.println(str);
		}
		for (int num : Gamedata.armorPos.values()) {		//HushMapのget処理 アイテム用myItemのkey値をすべて書き出す
						System.out.println(num);
		}
		
	}
}