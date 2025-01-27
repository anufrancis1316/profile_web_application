import { Routes } from '@angular/router';
import { AboutmeComponent } from './component/aboutme/aboutme.component';
import { AchievementsComponent } from './component/achievements/achievements.component';
import { ContactmeComponent } from './component/contactme/contactme.component';
import { ExperienceComponent } from './component/experience/experience.component';
import { HobbiesComponent } from './component/hobbies/hobbies.component';
import { HomeComponent } from './component/home/home.component';
import { SkillsetComponent } from './component/skillset/skillset.component';
import { TraininglistComponent } from './component/traininglist/traininglist.component';

export const routes: Routes = [
    {path:'', redirectTo:'home', pathMatch:'full'},
    {path:'home', component:HomeComponent},
    {path:'aboutme', component:AboutmeComponent}, 
    {path:'achievements', component:AchievementsComponent},
    {path:'contactme',component:ContactmeComponent},
    {path:'experience', component:ExperienceComponent},
    {path:'hobbies', component:HobbiesComponent},
    {path:'skillset',component:SkillsetComponent},
    {path:'traininglist', component:TraininglistComponent}

];
