class LoadTest{
	public static void main(String[] args){	//�f�[�^���[�h�̓���m�F�p
		//StartValue st = new StartValue();//�����l����e�X�g
		//st.startPoint();
		
		//Savedata svt = new Savedata();//�����l��������ꂽplayerState���t�@�C���ɕۑ�
		//svt.savePlayerState();
		//svt.saveFlagState();

		Loaddata ldd = new Loaddata();
		//ldd.loadPlayerState();
		//System.out.println(Gamedata.playerState.get("����̓|�C���g�@"));
		//System.out.println(Gamedata.playerState.get("���h��̓|�C���g"));
		//System.out.println(Gamedata.playerState.get("���̗̓|�C���g�@"));


		//ldd.loadFlagState();
		//System.out.println(Gamedata.flagState.get("C1"));
		//System.out.println(Gamedata.flagState.get("J6"));
		
		//ldd.loadPlayerState2();
		//System.out.println(Gamedata.playerState2[0][0]);System.out.println(Gamedata.playerState2[0][1]);System.out.println(Gamedata.playerState2[0][2]);
		//System.out.println(Gamedata.playerState2[0][3]);
		//System.out.println(Gamedata.playerState2[1][0]);
		//System.out.println(Gamedata.playerState2[2][0]);

		//ldd.loadPatyState();
		//System.out.println(Gamedata.fighterBState.get("����̓|�C���g�@"));
		//System.out.println(Gamedata.magiState.get("�̗̓|�C���g�@�@"));
		//System.out.println(Gamedata.fighterDState.get("�̗̓|�C���g�@�@"));
		
		ldd.loadWeaponAndArmor();
		System.out.println("�v���C���[��������"+Gamedata.playerWeapon);
		System.out.println("b��������"+Gamedata.bWeapon);
		System.out.println("c��������"+Gamedata.cWeapon);
		System.out.println("d��������"+Gamedata.dWeapon);
		for (String str : Gamedata.weaponPos.keySet()) {		//HushMap��get���� �A�C�e���pmyItem��key�l�����ׂď����o��
						System.out.println(str);
		}
		for (int num : Gamedata.weaponPos.values()) {		//HushMap��get���� �A�C�e���pmyItem��key�l�����ׂď����o��
						System.out.println(num);
		}
		System.out.println("�v���C���[�����h��"+Gamedata.playerArmor);
		System.out.println("b�����h��"+Gamedata.bArmor);
		System.out.println("c�����h��"+Gamedata.cArmor);
		System.out.println("d�����h��"+Gamedata.dArmor);
			
		for (String str : Gamedata.armorPos.keySet()) {		//HushMap��get���� �A�C�e���pmyItem��value�l�����ׂď����o��
						System.out.println(str);
		}
		for (int num : Gamedata.armorPos.values()) {		//HushMap��get���� �A�C�e���pmyItem��key�l�����ׂď����o��
						System.out.println(num);
		}
		
	}
}