package com.leetcode;/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-27 17:25
 */
public class Trie_208 {

    private Trie_208 [] children;

    private boolean isEnd;

    public Trie_208() {
        this.children = new Trie_208[26];
        isEnd = false;
    }

    public void insert(String word) {
        if(word == null || word.length() == 0) {
            return;
        }
        Trie_208 node = this;
        for(int i = 0;i<word.length();i++) {
            int index = word.charAt(i) - 'a';
            if(node.children[index] == null) {
                node.children[index] = new Trie_208();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie_208 node = searchNode(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchNode(prefix) != null;
    }

    public Trie_208 searchNode(String word) {
        if(word == null || word.length() == 0) {
            return null;
        }
        Trie_208 node = this;
        for(int i = 0;i<word.length();i++) {
            int index = word.charAt(i) - 'a';
            if(node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }

}