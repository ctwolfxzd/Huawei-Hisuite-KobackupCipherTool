package irsl;

import irsl.crypto.backupsecurityv3.KobackupBackupSecurityv3Cipher;

public class BackupSecurityV3DecryptionToolTar {
	public static void main(String[] args) throws Exception{

		if(args.length != 5) {
			System.err.println("Usage: java irsl.BackupSecurityV3DecryptionTool path-to-encrypted-file password encmsgv3 iv path-to-result");
			return;
		}
		
		String encryptedFilePath = args[0];
		String password = args[1];
		String encMsgV3 = args[2];
		String iv = args[3];
		String filePathResult = args[4];
		
		KobackupBackupSecurityv3Cipher ksc = KobackupBackupSecurityv3Cipher.initTar(password, encMsgV3, iv);
		ksc.DecryptFile(encryptedFilePath, filePathResult);
	}
}
