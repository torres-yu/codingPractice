package com.example.codingpractice.more;

import java.util.*;

public class Banned {

    private boolean[] marked;
    private Set<User> userList;
    private String[] temps;

    public int solution(String[] user_id, String[] banned_id) {

        marked = new boolean[user_id.length];
        temps = new String[banned_id.length];
        userList = new HashSet<>();

        dfs(user_id, banned_id, 0);

        return userList.size();
    }

    private void dfs(String[] user_id, String[] banned_id, int depth) {

        if(depth==banned_id.length) {
            userList.add(new User(temps));
            return;
        }

        for(int i = 0 ; i < user_id.length ; i++) {

            if(marked[i]) continue;

            //메인 로직
            int count = 0;
            if(user_id[i].length()==banned_id[depth].length()) {
                for (int j = 0; j < user_id[i].length(); j++) {
                    if (banned_id[depth].charAt(j) == '*'
                            || banned_id[depth].charAt(j) == user_id[i].charAt(j))
                        count++;
                }
            }
            if (user_id[i].length()==count) {
                marked[i] = true;
                temps[depth] = user_id[i];
                dfs(user_id, banned_id, depth+1);
                marked[i] = false;
            }
        }
    }
}

class User {

    private String[] users;

    User(String[] users) {
        this.users = new String[users.length];
        for(int i = 0 ; i < users.length ; i++)
            this.users[i] = users[i];
        Arrays.sort(this.users);
    }

    @Override
    public boolean equals(Object o) {
        User user = (User) o;
        return Arrays.equals(users, user.users);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(users);
    }
}

