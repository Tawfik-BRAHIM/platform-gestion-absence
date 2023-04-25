import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AbsParGrpComponent } from './abs-par-grp.component';

describe('AbsParGrpComponent', () => {
  let component: AbsParGrpComponent;
  let fixture: ComponentFixture<AbsParGrpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AbsParGrpComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AbsParGrpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
