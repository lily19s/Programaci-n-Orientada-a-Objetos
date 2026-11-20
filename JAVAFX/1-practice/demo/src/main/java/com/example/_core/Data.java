package com.example._core;

import java.util.ArrayList;
import com.example._models.DashboardTask;
import com.example._models.TeamMember;

public class Data {

   public static ArrayList<DashboardTask> tasks = new ArrayList<>();

   public static ArrayList<TeamMember> members = new ArrayList<>();

   
   public static boolean emailExists(String email, TeamMember ignore) {
      for (TeamMember member : members) {
         if (member != ignore && member.getEmail().equalsIgnoreCase(email)) {
            return true;
         }
      }
      return false;
   }

  
   public static int countTasksOf(TeamMember member) {
      int total = 0;
      for (DashboardTask task : tasks) {
         if (task.getAssignee() == member) {
            total++;
         }
      }
      return total;
   }

  
   public static void removeMember(TeamMember member) {
      for (DashboardTask task : tasks) {
         if (task.getAssignee() == member) {
            task.setAssignee(null);
         }
      }
      members.remove(member);
   }
}