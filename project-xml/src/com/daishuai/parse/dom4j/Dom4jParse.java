package com.daishuai.parse.dom4j;

import com.daishuai.util.FileUtil;
import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/4/9 21:34
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class Dom4jParse {

    public static void main(String[] args) throws Exception {
        File file = new FileUtil().getFile("xml"+ File.separator+"books.xml");
        // 解析books.xml文件
        // 创建SAXReader的对象reader
        SAXReader reader = new SAXReader();
        try {
            // 通过reader对象的read方法加载books.xml文件,获取docuemnt对象。
            Document document = reader.read(file);
            // 通过document对象获取根节点bookstore
            Element bookStore = document.getRootElement();
            // 通过element对象的elementIterator方法获取迭代器
            Iterator it = bookStore.elementIterator();
            // 遍历迭代器，获取根节点中的信息（书籍）
            getChildElement(bookStore);

            while (it.hasNext()) {
                System.out.println("=====开始遍历某一本书=====");
                Element book = (Element) it.next();
                // 获取book的属性名以及 属性值
                List<Attribute> bookAttrs = book.attributes();
                for (Attribute attr : bookAttrs) {
                    System.out.println("属性名：" + attr.getName() + "--属性值：" + attr.getValue());
                }
                System.out.println("节点名：" + book.getName() + "--节点值：" + book.getStringValue());
                Iterator itt = book.elementIterator();
                getChildElement(book);
                System.out.println("=====结束遍历某一本书=====");
            }
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void getChildElement(Element element){
        Iterator iterator = element.elementIterator();
        while(iterator.hasNext()){
            Node node = (Node) iterator.next();
            System.out.println("节点名：" + node.getName() + "--节点值：" + node.getStringValue());
            if(node instanceof Element){
                getChildElement((Element) node);
            }
            if (node instanceof Text){
                Text text = (Text) node;
                System.out.println("text--------"+text.getName());
                System.out.println("text--------"+text.getStringValue());
            }
        }
    }
}
