import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GrpensComponent } from './grpens.component';

describe('GrpensComponent', () => {
  let component: GrpensComponent;
  let fixture: ComponentFixture<GrpensComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GrpensComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GrpensComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
