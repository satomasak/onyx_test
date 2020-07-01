class SaveTest{
	public static void main(String[] args){	//データのセーブ動作確認用
		Savedata svd = new Savedata();
		svd.savePlayerState();
		svd.saveFlagState();
		svd.savePlayerState2();
		svd.savePatyState();
		svd.saveOth();
		svd.saveItrm();
		svd.saveWeaponAndArmor();
		System.out.println("セーブ終了");
	
	}

}