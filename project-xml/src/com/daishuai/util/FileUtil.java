package com.daishuai.util;

import java.io.File;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/4/9 20:51
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class FileUtil {



    public File getFile(String url){
        File file = new File(this.getClass().getResource("/").getPath() + url);
        return file;
    }
}
