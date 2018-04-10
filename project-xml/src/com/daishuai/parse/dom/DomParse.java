package com.daishuai.parse.dom;

import com.daishuai.util.FileUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/4/9 20:25
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class DomParse {

    public static void main(String[] args) throws Exception {
        File file = new FileUtil().getFile("xml"+ File.separator+"books.xml");
        System.out.println(file.exists());
        //创建一个DocumentBuilderFactory的对象
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //创建一个DocumentBuilder的对象
        DocumentBuilder builder = factory.newDocumentBuilder();
        //通过DocumentBuilder对象的parser方法加载books.xml文件到当前项目下
        Document document = builder.parse(file);
        //获取所有book节点的集合
        NodeList books = document.getElementsByTagName("book");

        for (int i=0; i< books.getLength();i++){
            //通过item(index)方法获取book节点的某一个属性
            Node node = books.item(i);
            String nodeName = node.getNodeName();
            System.out.println(nodeName);
            //解析book节点的子节点
            NodeList childNodes = node.getChildNodes();
            for (int j=0; j< childNodes.getLength(); j++){
                Node item = childNodes.item(j);
                //区分出text类型的node以及element类型的node
                if(item.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println(item.getNodeName());
                    System.out.println(item.getFirstChild().getNodeValue());
                }
            }
        }
    }
}
