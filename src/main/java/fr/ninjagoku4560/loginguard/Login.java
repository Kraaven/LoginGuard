package fr.ninjagoku4560.loginguard;

import fr.ninjagoku4560.loginguard.utils.FileUtil;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.Objects;

public class Login {
    static private final String FolderName = "password";
    public static int check(ServerPlayerEntity player, String password) {
        String path = FolderName+"\\"+player.getName().getString()+".txt";
        String Truepassword = FileUtil.read(path);
        if (password.equals(Truepassword)) {
            return 1;
        } else if (Objects.equals(Truepassword, "") || Truepassword == null) {
            return 2;
        } else {
            return 0;
        }
    }
}
